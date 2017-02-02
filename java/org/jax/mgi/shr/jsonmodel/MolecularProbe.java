package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;
import java.util.List;


/* Is a molecular probe, specifically what's needed for the probe summary page that is accessed
 * from the marker detail page and the reference detail/summary page.  This object is used to send
 * the data as JSON into a Solr index and to then represent it in the fewi when the data is pulled back out.
 */
public class Probe implements Serializable {
	private String primaryID;
	private String name;
	private List<String> collections;
	private String segmentType;
	private List<ProbeMarker> markers;
	
	public Probe() {}
	
	public Probe(String primaryID, String name, List<String> collections, String segmentType,
			List<ProbeMarker> markers) {
		this.primaryID = primaryID;
		this.name = name;
		this.collections = collections;
		this.segmentType = segmentType;
		this.markers = markers;
	}

	public String getPrimaryID() {
		return primaryID;
	}

	public void setPrimaryID(String primaryID) {
		this.primaryID = primaryID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCollections() {
		return collections;
	}

	public void setCollections(List<String> collections) {
		this.collections = collections;
	}

	public String getSegmentType() {
		return segmentType;
	}

	public void setSegmentType(String segmentType) {
		this.segmentType = segmentType;
	}

	public List<ProbeMarker> getMarkers() {
		return markers;
	}

	public void setMarkers(List<ProbeMarker> markers) {
		this.markers = markers;
	}

	@Override
	public String toString() {
		return "Clone [primaryID=" + primaryID + ", name=" + name + ", collections=" + collections 
				+ ", segmentType=" + segmentType + ", markers=" + markers + "]";
	}

}
