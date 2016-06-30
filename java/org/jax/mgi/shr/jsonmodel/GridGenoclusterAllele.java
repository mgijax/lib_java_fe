package org.jax.mgi.shr.jsonmodel;

/* works in combination with GridGenocluster, storing the data for one allele and its corresponding marker.
 * Data is eventually used to populate the Find Mice dialog boxes on the HMDC grid popup.
 */
public class GridGenoclusterAllele {
	private String alleleID;
	private String alleleSymbol;
	private Integer alleleImsrCount;
	private String markerID;
	private String markerSymbol;
	private Integer markerImsrCount;
	
	public GridGenoclusterAllele() {}
	
	public GridGenoclusterAllele(String alleleID, String alleleSymbol, Integer alleleImsrCount, String markerID, String markerSymbol, Integer markerImsrCount) {
		this.alleleID = alleleID;
		this.alleleSymbol = alleleSymbol;
		this.alleleImsrCount = alleleImsrCount;
		this.markerID = markerID;
		this.markerSymbol = markerSymbol;
		this.markerImsrCount = markerImsrCount; 
	}

	public String getAlleleID() {
		return alleleID;
	}
	public void setAlleleID(String alleleID) {
		this.alleleID = alleleID;
	}
	public String getAlleleSymbol() {
		return alleleSymbol;
	}
	public void setAlleleSymbol(String alleleSymbol) {
		this.alleleSymbol = alleleSymbol;
	}
	public Integer getAlleleImsrCount() {
		return alleleImsrCount;
	}
	public void setAlleleImsrCount(Integer alleleImsrCount) {
		this.alleleImsrCount = alleleImsrCount;
	}
	public String getMarkerID() {
		return markerID;
	}
	public void setMarkerID(String markerID) {
		this.markerID = markerID;
	}
	public String getMarkerSymbol() {
		return markerSymbol;
	}
	public void setMarkerSymbol(String markerSymbol) {
		this.markerSymbol = markerSymbol;
	}
	public Integer getMarkerImsrCount() {
		return markerImsrCount;
	}
	public void setMarkerImsrCount(Integer markerImsrCount) {
		this.markerImsrCount = markerImsrCount;
	}
}
