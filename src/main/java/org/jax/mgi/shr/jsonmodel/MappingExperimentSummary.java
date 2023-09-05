package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;
import java.util.List;


/* Is a genetic mapping experiment, specifically what's needed for the mapping summary page that is accessed
 * from the marker detail page and the reference detail/summary page.  This object is used to send
 * the data as JSON into a Solr index and to then represent it in the fewi when the data is pulled back out.
 */
public class MappingExperimentSummary implements Serializable {
	private String primaryID;
	private String type;
	private List<String> details;
	private String chromosome;
	private String jnumID;
	private String citation;
	
	public MappingExperimentSummary() {}

	public String getPrimaryID() {
		return primaryID;
	}

	public void setPrimaryID(String primaryID) {
		this.primaryID = primaryID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}

	public String getChromosome() {
		return chromosome;
	}

	public void setChromosome(String chromosome) {
		this.chromosome = chromosome;
	}

	public String getJnumID() {
		return jnumID;
	}

	public void setJnumID(String jnumID) {
		this.jnumID = jnumID;
	}

	public String getCitation() {
		return citation;
	}

	public void setCitation(String citation) {
		this.citation = citation;
	}

	@Override
	public String toString() {
		return "MappingExperimentSummary [primaryID=" + primaryID + ", type=" + type + ", details=" + details
				+ ", chromosome=" + chromosome + ", jnumID=" + jnumID + ", citation=" + citation + "]";
	}
}
