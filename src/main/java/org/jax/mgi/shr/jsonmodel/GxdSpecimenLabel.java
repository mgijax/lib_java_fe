package org.jax.mgi.shr.jsonmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Meta information about image specimen label
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class GxdSpecimenLabel {
	
	private String label;
	private String assayId;

}
