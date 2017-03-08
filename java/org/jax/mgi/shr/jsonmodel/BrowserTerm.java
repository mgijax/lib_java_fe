package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;
import java.util.List;


/* Is a vocabulary term with relevant details for display (parents, children, etc.).
 * Used by the shared vocabulary browser.
 */
public class BrowserTerm implements Serializable {
	private BrowserID primaryID;
	private List<BrowserID> secondaryIDs;
	private String term;
	private List<BrowserSynonym> synonyms; 
	private String definition;
	private BrowserParent defaultParent;
	private List<BrowserParent> allParents;
	private List<BrowserChild> children;
	private Integer annotationCount;
	private String annotationLabel;
	private String annotationUrl;
	
	public BrowserTerm() {}

	public List<BrowserParent> getAllParents() {
		return allParents;
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

	public List<BrowserChild> getChildren() {
		return children;
	}

	public BrowserParent getDefaultParent() {
		return defaultParent;
	}

	public String getDefinition() {
		return definition;
	}

	public BrowserID getPrimaryID() {
		return primaryID;
	}

	public List<BrowserID> getSecondaryIDs() {
		return secondaryIDs;
	}

	public List<BrowserSynonym> getSynonyms() {
		return synonyms;
	}

	public String getTerm() {
		return term;
	}

	public void setAllParents(List<BrowserParent> allParents) {
		this.allParents = allParents;
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

	public void setChildren(List<BrowserChild> children) {
		this.children = children;
	}

	public void setDefaultParent(BrowserParent defaultParent) {
		this.defaultParent = defaultParent;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public void setPrimaryID(BrowserID primaryID) {
		this.primaryID = primaryID;
	}

	public void setSecondaryIDs(List<BrowserID> secondaryIDs) {
		this.secondaryIDs = secondaryIDs;
	}

	public void setSynonyms(List<BrowserSynonym> synonyms) {
		this.synonyms = synonyms;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	@Override
	public String toString() {
		return "BrowserTerm [primaryID=" + primaryID + ", secondaryIDs=" + secondaryIDs + ", term=" + term
				+ ", synonyms=" + synonyms + ", definition=" + definition + ", defaultParent=" + defaultParent
				+ ", allParents=" + allParents + ", children=" + children + ", annotationCount=" + annotationCount
				+ ", annotationLabel=" + annotationLabel + ", annotationUrl=" + annotationUrl + "]";
	}
}
