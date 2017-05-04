package org.jax.mgi.shr.fe.query;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * In order to implement querying multiple genetic location regions for a single document,
 * 	we need to use Solr's spatial analysis tools.
 * 	 Refer to (https://people.apache.org/~hossman/spatial-for-non-spatial-meetup-20130117/#slide8) for more details
 * 	    For more detail also see (http://wiki.apache.org/solr/SolrAdaptersForLuceneSpatial4)
 * 
 * Requires at least Solr 4.0
 * 
 * 
 * This class is responsible for translating locations and location queries into proper syntax
 * 	for the spatial query. It will be used both at index time and at query time.
 * 
 * @author - kstone - 2013/07/23
 */
public class SolrLocationTranslator 
{
	//------- configurable parameters -------------
	// Please be aware that the Solr field definition needs to know the maximum possible values ahead of time.
	// 	They should be something higher than the number of chromosomes multiplied by the chromosome offset (10 billion is a safe bet)
	
	public static long MAX_BOUNDS = 10000000000L;
	public static long NEG_BOUNDS;
	static
	{
		NEG_BOUNDS = -1*MAX_BOUNDS;
	}
	
	/*
	 * Here we initialise a static map of all possible chromosomes that we can accept coordinates for.
	 * We cannot just accept any chromosome value. We must know how to offset it ahead of time.
	 */
	public static final Map<String,Integer> VALID_CHROMOSOMES = new HashMap<String,Integer>();
	static
	{
		List<String> validChrs = Arrays.asList("1","2","3","4","5","6","7","8","9","10",
				"11","12","13","14","15","16","17","18","19","20","21","22",
				"X","Y","XY","MT");
		for(int i=0; i<validChrs.size(); i++)
		{
			VALID_CHROMOSOMES.put(validChrs.get(i),new Integer(i));
			VALID_CHROMOSOMES.put(validChrs.get(i).toLowerCase(),new Integer(i));
		}
	}
	
	public static final long CHROMOSOME_OFFSET = 300000000L; // 300 million base pairs, intended to be the max bounds on a chromosome
	
	// ------ public functions ----------
	public static String getIndexValue(String chromosome, long startCoordinate, long endCoordinate, boolean strand)
	{
		if(!isChromosomeValid(chromosome)) return "";
		
		// normalise coordinate values
		if(startCoordinate > CHROMOSOME_OFFSET) startCoordinate = CHROMOSOME_OFFSET-1;
		if(endCoordinate > CHROMOSOME_OFFSET) endCoordinate = CHROMOSOME_OFFSET-1;

		// convert coordinates to the appropriate offset based on chromosome
		long chrOffset = CHROMOSOME_OFFSET * getChromosomeIndex(chromosome);
		long start = startCoordinate + chrOffset;
		long end = endCoordinate + chrOffset;
		
		String indexValue = "";
		if(strand)
		{
			indexValue +=  start + " " + end;
		}
		else
		{
			start *= -1;
			end *= -1;
			indexValue += end + " " + start;
		}
		return indexValue;
	}
	
	public static String getQueryValue(String chromosome, long startCoordinate, long endCoordinate, boolean strand)
	{
		if(!isChromosomeValid(chromosome)) return "";
		
		// make sure coords fall within chromosome offset
		if(startCoordinate < 0) startCoordinate = 0;
		else if(startCoordinate > CHROMOSOME_OFFSET) startCoordinate = CHROMOSOME_OFFSET;
		if(endCoordinate < 0) endCoordinate = 0;
		else if(endCoordinate > CHROMOSOME_OFFSET) endCoordinate = CHROMOSOME_OFFSET;
		
		// convert coordinates to the appropriate offset based on chromosome
		long chrOffset = CHROMOSOME_OFFSET * getChromosomeIndex(chromosome);
		long start = startCoordinate + chrOffset;
		long end = endCoordinate + chrOffset;
		
		// make sure coords are within global bounds
		if(startCoordinate >= MAX_BOUNDS || endCoordinate >= MAX_BOUNDS)
		{
			return "";
		}
		
		String queryValue = "\"Intersects(";
		if(strand)
		{
			queryValue += "0 "+bufferCoord(start,false)+" "+bufferCoord(end)+" "+MAX_BOUNDS;
		}
		else
		{
			start *= -1;
			end *= -1;
			queryValue += NEG_BOUNDS+" "+bufferCoord(end,false)+" "+bufferCoord(start)+" 0";
		}
		queryValue += ")\"";
		return queryValue;
	}
	
	// add a buffer to the coordinate for more accurate searches (per Solr spatial search docs)
	private static String bufferCoord(long coord)
	{
		return bufferCoord(coord,true);
	}
	private static String bufferCoord(long coord,boolean plus)
	{
		int buffer = 0;
		if(!plus) buffer = -1;
		return (coord+buffer)+".5";
	}
	
	/*
	 * A convenience function to parse user input
	 * Expected formats:
	 *  chr1:10010011-24294294 // postitive strand chr 1
	 *  	1:10010011-24294294 // alternate syntax
	 *  	1:10010011..24294294 // alternate syntax
	 *  -chr1:1034503-1055000 // negative strand chr 1
	 *  +chr2:2000-50000 // positive strand chr 2
	 *  chr5 // everything on chromosome 5 positive strand
	 *  -chr5 // everythihg on chromosome 5 negative strand
	 *  
	 *  NOTE: we can't support entire chromosome (both strands) in one query.
	 *  	We need the field name in order to build the OR clause.
	 *  	It will be up to the caller to pass in both strands if that want entire chromosome
	 *  
	 *  returns empty string for all errors in input string format
	 */
	public static String getQueryValue(String queryString, String units)
	{
		if(queryString==null) return "";
		int multiplier = 1;
		if ((units != null) && ("Mbp".equalsIgnoreCase(units))) {
			multiplier = 1000000;
		}

		String errorReturn = "";
		queryString = queryString.toLowerCase();
		queryString = queryString.replace("chr",""); // remove the optional "chr" text
		if(queryString.equals("")) return "";
		
		// resolve strand
		// assume +
		boolean strand = true;
		if(queryString.charAt(0)=='+' || queryString.charAt(0)=='-')
		{
			strand = queryString.charAt(0)=='+';
			queryString = queryString.substring(1);
		}
		
		//resolve chromosome
		String[] pieces = queryString.split(":");
		if(pieces.length<1 || pieces.length>2) return errorReturn;
		String chrPiece = pieces[0];
		//if(chrPiece.indexOf("chr")!=0) return errorReturn;
		//String chromosome = chrPiece.substring(3);
		String chromosome = chrPiece;
		
		// handle entire chromosome
		if(pieces.length==1) return getQueryValue(chromosome,0,CHROMOSOME_OFFSET-1,strand);
		
		//resolve coordinates
		String coordPiece = pieces[1];
		String[] coordPieces = coordPiece.split("-|\\.\\.");
		if(coordPieces.length!=1 && coordPieces.length!=2) return errorReturn;
		String coord1String = coordPieces[0];
		// set coord2 = coord1 if only one coord is supplied
		String coord2String = coord1String;
		if(coordPieces.length==2) coord2String = coordPieces[1];
		
		long start,end;
		try
		{
			start = Math.round((Double.parseDouble(coord1String) * multiplier));
			end = Math.round((Double.parseDouble(coord2String) * multiplier));
		}catch(NumberFormatException nfe)
		{
			return errorReturn;
		}
		return getQueryValue(chromosome,start,end,strand);
	}
	
	// ----- private functions ----------
	
	/*
	 * get the index of a chromsome (must be a valid chromosome string as declared above
	 */
	private static int getChromosomeIndex(String chromosome)
	{
		return VALID_CHROMOSOMES.get(chromosome);
	}
	/*
	 * true if the chromosome string has been declared in the list above
	 */
	private static boolean isChromosomeValid(String chromosome)
	{
		return VALID_CHROMOSOMES.containsKey(chromosome);
	}
	
}
