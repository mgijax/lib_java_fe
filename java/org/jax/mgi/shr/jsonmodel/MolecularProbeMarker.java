package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;


/* Is a single marker for display on the molecular probe summary page.  This object is used
 * to send the data as JSON into a Solr index and to then represent it in the fewi
 * when the data is pulled back out.
 */
public class ProbeMarker implements Serializable {
	
	private String symbol;
	private String primaryID;
	private boolean isPutative = false;
	private String chromosome;
	private String offset;
	
	public ProbeMarker() {}
	
	public ProbeMarker(String symbol, String primaryID, boolean isPutative, String chromosome, String offset) {
		this.symbol = symbol;
		this.primaryID = primaryID;
		this.isPutative = isPutative;
		this.chromosome = chromosome;
		this.offset = offset;
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
	public String getChromosome() {
		return chromosome;
	}
	public void setChromosome(String chromosome) {
		this.chromosome = chromosome;
	}
	public String getOffset() {
		return offset;
	}
	public void setOffset(String offset) {
		this.offset = offset;
	}
	
	public String getLocation() {
		StringBuffer sb = new StringBuffer();
		sb.append(chromosome);
		if (this.offset != null) {
			sb.append(" (");
			sb.append(this.offset);
			sb.append(" cM)");
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "CloneMarker [symbol=" + symbol + ", primaryID=" + primaryID + ", isPutative=" + isPutative + "]";
	}

}
