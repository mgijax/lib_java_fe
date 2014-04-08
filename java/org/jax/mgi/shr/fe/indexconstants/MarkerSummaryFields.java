package org.jax.mgi.shr.fe.indexconstants;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * Specific fields for marker summary
 */
public class MarkerSummaryFields {

	// mrk_label type to solr field mapping (for nomen queries/why matched/scoring)
	public static Map<String,String> NOMEN_FIELDS = new LinkedHashMap<String,String>();
	static
	{
        // init nomen fields in priority order
    	NOMEN_FIELDS.put("current symbol","currentSymbol");
    	NOMEN_FIELDS.put("current name","currentName");
        NOMEN_FIELDS.put("allele symbol","alleleSymbol");
        NOMEN_FIELDS.put("allele name","alleleName");
        NOMEN_FIELDS.put("old symbol","oldSymbol");
        NOMEN_FIELDS.put("old name","oldName");
        NOMEN_FIELDS.put("synonym","synonym");
        NOMEN_FIELDS.put("human synonym","humanSynonym");
        NOMEN_FIELDS.put("rat synonym","ratSynonym");
        NOMEN_FIELDS.put("related synonym","relatedSynonym");
        NOMEN_FIELDS.put("human symbol","humanSymbol");
        NOMEN_FIELDS.put("human name","humanName");
        NOMEN_FIELDS.put("rat symbol","ratSymbol");
        NOMEN_FIELDS.put("rhesus macaque symbol","rhesusMacaqueSymbol");
        NOMEN_FIELDS.put("cattle symbol","cattleSymbol");
        NOMEN_FIELDS.put("dog symbol","dogSymbol");
        NOMEN_FIELDS.put("zebrafish symbol","zebrafishSymbol");
        NOMEN_FIELDS.put("chicken symbol","chickenSymbol");
	}
	
	
	
	// query fields unique to marker summary
	public static final String FEATURE_TYPE = "featureType";
	public static final String FEATURE_TYPE_KEY = "featureTypeKey"; // the mcv key for marker features
	public static final String GO_PROCESS_TERM = "goProcessTerm";
	public static final String GO_FUNCTION_TERM = "goFunctionTerm";
	public static final String GO_COMPONENT_TERM = "goComponentTerm";
	public static final String GO_TERM = "goTerm";
	public static final String INTERPRO_TERM = "interProTerm";
	public static final String PHENO_TEXT = "phenoText";
	public static final String PHENO_ID = "phenoId";
	
	// readonly fields for summary display
	public static final String COORDINATE_DISPLAY = "coordinateDisplay";
	public static final String LOCATION_DISPLAY = "locationDisplay";
	
	// sort fields
	public static final String BY_SYMBOL = "bySymbol";
	public static final String BY_LOCATION = "byLocation";

}
