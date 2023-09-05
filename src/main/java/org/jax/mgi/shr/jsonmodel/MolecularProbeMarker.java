package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;


/* Is a single marker for display on the molecular probe summary page.  This object is used
 * to send the data as JSON into a Solr index and to then represent it in the fewi
 * when the data is pulled back out.
 */
public class MolecularProbeMarker implements Serializable {
	
	private String symbol;
	private String primaryID;
	private boolean isPutative = false;
	private String location;
	
	public MolecularProbeMarker() {}
	
	public MolecularProbeMarker(String symbol, String primaryID, boolean isPutative, String location) {
		this.symbol = symbol;
		this.primaryID = primaryID;
		this.isPutative = isPutative;
		this.location = location;
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
	public boolean getIsPutative() {
		return isPutative;
	}
	public void setIsPutative(boolean isPutative) {
		this.isPutative = isPutative;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "ProbeMarker [symbol=" + symbol + ", primaryID=" + primaryID + ", isPutative=" + isPutative + "]";
	}

}
