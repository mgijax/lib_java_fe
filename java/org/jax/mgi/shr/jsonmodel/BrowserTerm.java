package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;
import java.util.ArrayList;
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
	private List<String> distinctSynonyms;
	private Integer annotationCount;
	private String annotationLabel;
	private String annotationUrl;
	private String comment;
	private String cleanComment;
	private String dagName;
	private boolean relatedToTissues;
	
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

	public String getComment() {
		return comment;
	}

	public String getCleanComment() {
        if (this.cleanComment != null) { return this.cleanComment; }

		// For MP terms, we need to exclude xrefs and comments (in curly braces) from display in the comment field.
		if ((comment != null) && (primaryID != null) && (primaryID.getAccID() != null) && (primaryID.getAccID().startsWith("MP:"))) {
			this.cleanComment = comment.replaceAll("\\{xref[^}]*\\}", "");
			this.cleanComment = this.cleanComment.replaceAll("\\{comment[^}]*\\}", "");
            return this.cleanComment;
		}

        this.cleanComment = comment;
		return comment;
	}

	public void setCleanComment(String cleanComment) {
		this.cleanComment = cleanComment;
	}

	public String getDagName() {
		return dagName;
	}

	public BrowserParent getDefaultParent() {
		return defaultParent;
	}

	public String getDefinition() {
		return definition;
	}

	/* get the list of distinct synonyms, disregarding the synonym type
	 */
	public List<String> getDistinctSynonyms() {
		if (distinctSynonyms != null) {
			return distinctSynonyms;
		} 
		
		distinctSynonyms = new ArrayList<String>();
		
		if (this.synonyms != null) {
			for (BrowserSynonym bs : this.getSynonyms()) {
				if (!distinctSynonyms.contains(bs.getSynonym())) {
					distinctSynonyms.add(bs.getSynonym());
				}
			}
		}
		return distinctSynonyms;
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

	public boolean isRelatedToTissues() {
		return relatedToTissues;
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

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setDagName(String dagName) {
		this.dagName = dagName;
	}

	public void setDefaultParent(BrowserParent defaultParent) {
		this.defaultParent = defaultParent;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public void setDistinctSynonyms(List<String> distinctSynonyms) {
		// no op; we just compute them when needed
		this.distinctSynonyms = distinctSynonyms;
	}

	public void setPrimaryID(BrowserID primaryID) {
		this.primaryID = primaryID;
	}

	public void setRelatedToTissues(boolean relatedToTissues) {
		this.relatedToTissues = relatedToTissues;
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
