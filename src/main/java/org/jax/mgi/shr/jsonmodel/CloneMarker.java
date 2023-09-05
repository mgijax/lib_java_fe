package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;


/* Is a single marker for display on the cDNA clone summary page.  This object is used
 * to send the data as JSON into a Solr index and to then represent it in the fewi
 * when the data is pulled back out.
 */
public class CloneMarker implements Serializable {
	
	private String symbol;
	private String primaryID;
	private boolean isPutative = false;
	
	public CloneMarker() {}
	
	public CloneMarker(String symbol, String primaryID, boolean isPutative) {
		this.symbol = symbol;
		this.primaryID = primaryID;
		this.isPutative = isPutative;
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

	@Override
	public String toString() {
		return "CloneMarker [symbol=" + symbol + ", primaryID=" + primaryID + ", isPutative=" + isPutative + "]";
	}

}
