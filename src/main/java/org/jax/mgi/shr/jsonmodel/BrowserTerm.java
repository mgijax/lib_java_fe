package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/* Is a vocabulary term with relevant details for display (parents, children, etc.).
 * Used by the shared vocabulary browser.
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
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
	private String hasNoAnnotations;
	private String comment;
	private String dagName;
	private boolean relatedToTissues;
	
	/* get the list of distinct synonyms, disregarding the synonym type
	 */
	public List<String> getDistinctSynonyms() {
		if (distinctSynonyms != null) {
			return distinctSynonyms;
		} 
		
		distinctSynonyms = new ArrayList<String>();
		
		if (this.synonyms != null) {
			for (BrowserSynonym bs : getSynonyms()) {
				if (!distinctSynonyms.contains(bs.getSynonym())) {
					distinctSynonyms.add(bs.getSynonym());
				}
			}
		}
		return distinctSynonyms;
	}

}
