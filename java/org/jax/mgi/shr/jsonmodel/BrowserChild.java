package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;


/* Is a child of a vocabulary term, storing enough info for display.
 * Used by the shared vocabulary browser.
 */
public class BrowserChild implements Serializable {
	private String primaryID;
	private String logicalDB;
	private String term;
	private String edgeType;
	private Integer hasChildren;
	private Integer annotationCount;
	private String annotationLabel;
	private String annotationUrl;

	public BrowserChild() {}

	public BrowserChild(String primaryID, String logicalDB, String term, String edgeType, Integer hasChildren) {
		this.primaryID = primaryID;
		this.logicalDB = logicalDB;
		this.term = term;
		this.edgeType = edgeType;
		this.hasChildren = hasChildren;
	}

	public Integer getAnnotationCount() {
		return annotationCount;
	}

	public String getAnnotationLabel() {
		return annotationLabel;
	}

	public String getAnnotationUrl() {
		return annotationUrl;
	}

	public String getEdgeType() {
		return edgeType;
	}

	public Integer getHasChildren() {
		return hasChildren;
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

	public void setAnnotationCount(Integer annotationCount) {
		this.annotationCount = annotationCount;
	}

	public void setAnnotationLabel(String annotationLabel) {
		this.annotationLabel = annotationLabel;
	}

	public void setAnnotationUrl(String annotationUrl) {
		this.annotationUrl = annotationUrl;
	}

	public void setEdgeType(String edgeType) {
		this.edgeType = edgeType;
	}

	public void setHasChildren(Integer hasChildren) {
		this.hasChildren = hasChildren;
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
		return "BrowserChild [primaryID=" + primaryID + ", logicalDB=" + logicalDB + ", term=" + term + ", edgeType="
				+ edgeType + ", hasChildren=" + hasChildren + "]";
	}
}
