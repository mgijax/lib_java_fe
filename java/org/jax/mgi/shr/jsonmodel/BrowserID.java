package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;


/* Is an accession ID / logical database pair for a vocabulary term.
 * Used by the shared vocabulary browser.
 */
public class BrowserID implements Serializable {
	private String accID;
	private String logicalDB;

	public BrowserID() {}

	public String getAccID() {
		return accID;
	}

	public String getLogicalDB() {
		return logicalDB;
	}

	public void setAccID(String accID) {
		this.accID = accID;
	}
	public void setLogicalDB(String logicalDB) {
		this.logicalDB = logicalDB;
	}
	
	@Override
	public String toString() {
		return "BrowserID [accID=" + accID + ", logicalDB=" + logicalDB + "]";
	}
}
