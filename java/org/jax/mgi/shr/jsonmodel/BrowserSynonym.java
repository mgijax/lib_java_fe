package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;


/* Is a synonym / synonym type pair for a vocabulary term.
 * Used by the shared vocabulary browser.
 */
public class BrowserSynonym implements Serializable {
	private String synonym;
	private String synonymType;
	
	public BrowserSynonym() {}

	public BrowserSynonym(String synonym, String synonymType) {
		this.synonym = synonym;
		this.synonymType = synonymType;
	}

	public String getSynonym() {
		return synonym;
	}

	public String getSynonymType() {
		return synonymType;
	}

	public void setSynonym(String synonym) {
		this.synonym = synonym;
	}

	public void setSynonymType(String synonymType) {
		this.synonymType = synonymType;
	}

	@Override
	public String toString() {
		return "BrowserSynonym [synonym=" + synonym + ", synonymType=" + synonymType + "]";
	}
}
