package org.jax.org.mgi.shr.jsonmodel;

import java.io.Serializable;


/* Is a single marker for display on the HMDC's grid display.  This object is used
 * to send the data as JSON into a Solr index and to then represent it in the fewi
 * when the data is pulled back out.
 */
public class GridMarker implements Serializable {
	
	private String symbol;
	private String primaryID;
	private String name;
	private String featureType;
	private Integer clusterKey;
	
	public GridMarker() {}
	
	public GridMarker(String symbol, String primaryID, String name, String featureType, Integer clusterKey) {
		this.symbol = symbol;
		this.primaryID = primaryID;
		this.name = name;
		this.featureType = featureType;
		this.clusterKey = clusterKey;
	}

	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getPrimaryID() {
		return primaryID;
	}
	public void setPrimaryID(String primaryID) {
		this.primaryID = primaryID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeatureType() {
		return featureType;
	}
	public void setFeatureType(String featureType) {
		this.featureType = featureType;
	}
	public Integer getClusterKey() {
		return clusterKey;
	}
	public void setClusterKey(Integer clusterKey) {
		this.clusterKey = clusterKey;
	}
}
