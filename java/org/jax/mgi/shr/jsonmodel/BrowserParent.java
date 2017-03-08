package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;


/* Is a parent of a vocabulary term, storing enough info for display.
 * Used by the shared vocabulary browser.
 */
public class BrowserParent implements Serializable {
	private String primaryID;
	private String logicalDB;
	private String term;
	private String edgeType;
	
	public BrowserParent() {}

	public String getEdgeType() {
		return edgeType;
	}

	public String getLogicalDB() {
		return logicalDB;
	}

	public String getPrimaryID() {
		return primaryID;
	}

	public String getTerm() {
		return term;
	}

	public void setEdgeType(String edgeType) {
		this.edgeType = edgeType;
	}

	public void setLogicalDB(String logicalDB) {
		this.logicalDB = logicalDB;
	}

	public void setPrimaryID(String primaryID) {
		this.primaryID = primaryID;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	@Override
	public String toString() {
		return "BrowserParent [primaryID=" + primaryID + ", logicalDB=" + logicalDB + ", term=" + term + ", edgeType="
				+ edgeType + "]";
	}
}
