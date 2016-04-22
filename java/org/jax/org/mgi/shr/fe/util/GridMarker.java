package org.jax.org.mgi.shr.fe.util;

import java.io.Serializable;

/* Is a single marker for display on the HMDC's grid display.  This object is used
 * to send the data as JSON into a Solr index and to then represent it in the fewi
 * when the data is pulled back out.
 */
public class GridMarker {
	public String symbol;
	public String primaryID;
	public String name;
	public String featureType;
	
	public GridMarker(String symbol, String primaryID, String name, String featureType) {
		this.symbol = symbol;
		this.primaryID = primaryID;
		this.name = name;
		this.featureType = featureType;
	}
}
