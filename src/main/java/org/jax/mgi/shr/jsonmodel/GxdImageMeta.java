package org.jax.mgi.shr.jsonmodel;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Meta data for the GXD Image Pane Solr index
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class GxdImageMeta {

	// instance variables
	public String assayType;
	public String markerSymbol;
	public String hybridization;
	public List<GxdSpecimenLabel> specimenLabels = new ArrayList<GxdSpecimenLabel>();

	public void addSpecimenLabel(String specimenLabel, String assayId) {
		GxdSpecimenLabel label = new GxdSpecimenLabel();
		label.setLabel(specimenLabel);
		label.setAssayId(assayId);
		
		// keep the labels unique
		if(!specimenLabels.contains(label)) {
			specimenLabels.add(label);
		}
	}
	
	// a key to be used in maps that represents the uniqueness of this object
	public String toKey() {
		return assayType+"||"+markerSymbol+"||"+hybridization;
	}

}
