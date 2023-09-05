package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;


/* Is a very simple representation of a marker.  Can be used by any jsonmodel object that needs it.
 */
public class SimpleMarker implements Serializable {
	
	private String symbol;
	private String primaryID;
	
	public SimpleMarker() {}
	
	public SimpleMarker(String symbol, String primaryID) {
		this.symbol = symbol;
		this.primaryID = primaryID;
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

	@Override
	public String toString() {
		return "SimpleMarker [symbol=" + symbol + ", primaryID=" + primaryID + "]";
	}
}
