package org.jax.mgi.shr.jsonmodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Meta data for the GXD Image Pane Solr index
 */
public class GxdImageMeta {

	// instance variables
	public String assayType;
	public String markerSymbol;
	public String hybridization;
	public List<GxdSpecimenLabel> specimenLabels=new ArrayList<GxdSpecimenLabel>();
	
	
	public String getAssayType() {
		return assayType;
	}

	public String getMarkerSymbol() {
		return markerSymbol;
	}

	public String getHybridization() {
		return hybridization;
	}

	public List<GxdSpecimenLabel> getSpecimenLabels() {
		return specimenLabels;
	}

	public void setAssayType(String assayType) {
		this.assayType = assayType;
	}

	public void setMarkerSymbol(String markerSymbol) {
		this.markerSymbol = markerSymbol;
	}

	public void setHybridization(String hybridization) {
		this.hybridization = hybridization;
	}

	public void setSpecimenLabels(List<GxdSpecimenLabel> specimenLabels) {
		this.specimenLabels = specimenLabels;
	}

	public void addSpecimenLabel(String specimenLabel,String assayId)
	{
		GxdSpecimenLabel label = new GxdSpecimenLabel();
		label.setLabel(specimenLabel);
		label.setAssayId(assayId);
		
		// keep the labels unique
		if(!specimenLabels.contains(label)) {
			specimenLabels.add(label);
		}
	}
	
	// a key to be used in maps that represents the uniqueness of this object
	public String toKey()
	{
		return assayType+"||"+markerSymbol+"||"+hybridization;
	}

}
