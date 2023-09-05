package org.jax.mgi.shr.jsonmodel;


/**
 * Meta information about image specimen label
 */
public class GxdSpecimenLabel {
	
	private String label;
	private String assayId;
	
	
	public String getLabel() {
		return label;
	}
	public String getAssayId() {
		return assayId;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public void setAssayId(String assayId) {
		this.assayId = assayId;
	}
	@Override
	public String toString() {
		return "GxdSpecimenLabel [label=" + label + ", assayId=" + assayId
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		GxdSpecimenLabel other = (GxdSpecimenLabel) obj;

		if (assayId == null) {
			if (other.assayId != null)
				return false;
		} else if (!assayId.equals(other.assayId))
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		return true;
	}

}
