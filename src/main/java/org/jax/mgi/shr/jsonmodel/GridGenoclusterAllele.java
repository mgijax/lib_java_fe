package org.jax.mgi.shr.jsonmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/* works in combination with GridGenocluster, storing the data for one allele and its corresponding marker.
 * Data is eventually used to populate the Find Mice dialog boxes on the HMDC grid popup.
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class GridGenoclusterAllele {
	private String alleleID;
	private String alleleSymbol;
	private Integer alleleImsrCount;
	private String markerID;
	private String markerSymbol;
	private Integer markerImsrCount;

}
