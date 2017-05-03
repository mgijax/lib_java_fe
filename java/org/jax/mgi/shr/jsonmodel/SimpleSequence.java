package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;
import java.util.List;


/* Is a sequence (specifically what's needed for display on the sequence summary page). This object is used
 * to send the data as JSON into a Solr index and to then represent it in the fewi when the data is pulled
 * back out.
 */
public class SimpleSequence implements Serializable {
	private int sequenceKey;
	private String primaryID;
	private String provider;
	private String sequenceType;
	private String length;
	private String species;
	private String strain;
	private String description;
	private String preferredGenbankID;
	private GenomicLocation location;
	private List<AccessionID> otherIDs;
	private List<String> cloneCollections;
	private List<SimpleMarker> markers;
	
	public SimpleSequence() {}

	public SimpleSequence(int sequenceKey, String primaryID, String provider, String sequenceType, String length,
			String species, String description) {
		this.sequenceKey = sequenceKey;
		this.primaryID = primaryID;
		this.provider = provider;
		this.sequenceType = sequenceType;
		this.length = length;
		this.species = species;
		this.description = description;
	}

	public List<String> getCloneCollections() {
		return cloneCollections;
	}

	public String getDescription() {
		return description;
	}

	public String getLength() {
		return length;
	}

	public GenomicLocation getLocation() {
		return location;
	}

	public List<SimpleMarker> getMarkers() {
		return markers;
	}

	public List<AccessionID> getOtherIDs() {
		return otherIDs;
	}

	public String getPreferredGenbankID() {
		return preferredGenbankID;
	}

	public String getPrimaryID() {
		return primaryID;
	}

	public String getProvider() {
		return provider;
	}

	public int getSequenceKey() {
		return sequenceKey;
	}

	public String getSequenceType() {
		return sequenceType;
	}

	public String getSpecies() {
		return species;
	}

	public String getStrain() {
		return strain;
	}

	public void setCloneCollections(List<String> cloneCollections) {
		this.cloneCollections = cloneCollections;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public void setLocation(GenomicLocation location) {
		this.location = location;
	}

	public void setMarkers(List<SimpleMarker> markers) {
		this.markers = markers;
	}

	public void setOtherIDs(List<AccessionID> otherIDs) {
		this.otherIDs = otherIDs;
	}

	public void setPreferredGenbankID(String preferredGenbankID) {
		this.preferredGenbankID = preferredGenbankID;
	}

	public void setPrimaryID(String primaryID) {
		this.primaryID = primaryID;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public void setSequenceKey(int sequenceKey) {
		this.sequenceKey = sequenceKey;
	}

	public void setSequenceType(String sequenceType) {
		this.sequenceType = sequenceType;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	@Override
	public String toString() {
		return "Sequence [sequenceKey=" + sequenceKey + ", primaryID=" + primaryID + ", provider=" + provider
				+ ", sequenceType=" + sequenceType + ", length=" + length + ", species=" + species + ", description="
				+ description + ", cloneCollections=" + cloneCollections + ", markers=" + markers + "]";
	}
}
