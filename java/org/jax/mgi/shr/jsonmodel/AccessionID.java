package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;


/* Is an accession ID / logical database pair.
 */
public class AccessionID implements Serializable {
	private String accID;
	private String logicalDB;

	public AccessionID() {}
	
	public AccessionID(String accID, String logicalDB) {
		this.accID = accID;
		this.logicalDB = logicalDB;
	}

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
		return "AccessionID [accID=" + accID + ", logicalDB=" + logicalDB + "]";
	}
}
