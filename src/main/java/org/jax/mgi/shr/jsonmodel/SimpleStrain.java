package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;
import java.util.List;


/* Is a very simple representation of a mouse strain.  Can be used by any jsonmodel object that needs it.
 */
public class SimpleStrain implements Serializable {
	
	private String name;
	private String primaryID;
	private List<String> synonyms;
	private List<String> attributes;
	private List<AccessionID> accessionIDs;
	private Integer referenceCount;
	
	public SimpleStrain() {}
	
	public SimpleStrain(String name, String primaryID) {
		this.name = name;
		this.primaryID = primaryID;
	}

	public List<AccessionID> getAccessionIDs() {
		return accessionIDs;
	}

	public List<String> getAttributes() {
		return attributes;
	}

	public String getName() {
		return name;
	}

	public String getPrimaryID() {
		return primaryID;
	}

	public Integer getReferenceCount() {
		return referenceCount;
	}

	public List<String> getSynonyms() {
		return synonyms;
	}

	public void setAccessionIDs(List<AccessionID> accessionIDs) {
		this.accessionIDs = accessionIDs;
	}

	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrimaryID(String primaryID) {
		this.primaryID = primaryID;
	}

	public void setReferenceCount(Integer referenceCount) {
		this.referenceCount = referenceCount;
	}

	public void setSynonyms(List<String> synonyms) {
		this.synonyms = synonyms;
	}

	@Override
	public String toString() {
		return "SimpleStrain [name=" + name + ", primaryID=" + primaryID + ", synonyms=" + synonyms + ", attributes="
				+ attributes + ", accessionIDs=" + accessionIDs + ", referenceCount=" + referenceCount + "]";
	}
}
