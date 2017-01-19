package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;
import java.util.List;


/* Is a cDNA clone, specifically what's needed for the cDNA summary page that is accessed
 * from the marker detail page.  This object is used to send the data as JSON into a Solr
 * index and to then represent it in the fewi when the data is pulled back out.
 */
public class Clone implements Serializable {
	private String primaryID;
	private String name;
	private List<String> collections;
	private String age;
	private String tissue;
	private String cellLine;
	private List<CloneMarker> markers;
	
	public Clone() {}
	
	public Clone(String primaryID, String name, List<String> collections, String age, String tissue,
			String cellLine, List<CloneMarker> markers) {
		this.primaryID = primaryID;
		this.name = name;
		this.collections = collections;
		this.age = age;
		this.tissue = tissue;
		this.cellLine = cellLine;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTissue() {
		return tissue;
	}

	public void setTissue(String tissue) {
		this.tissue = tissue;
	}

	public String getCellLine() {
		return cellLine;
	}

	public void setCellLine(String cellLine) {
		this.cellLine = cellLine;
	}

	public List<CloneMarker> getMarkers() {
		return markers;
	}

	public void setMarkers(List<CloneMarker> markers) {
		this.markers = markers;
	}

	@Override
	public String toString() {
		return "Clone [primaryID=" + primaryID + ", name=" + name + ", collections=" + collections + ", age=" + age
				+ ", tissue=" + tissue + ", cellLine=" + cellLine + ", markers=" + markers + "]";
	}

}
