package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/* Represents allele and marker data for a genocluster, specifically what's needed for the
 * Find Mice dialogs on the HMDC grid popup (and MP slimgrid popup).  This object is used
 * to send the data as JSON into a Solr index and to then represent it in the fewi
 * when the data is pulled back out.
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class GridGenocluster implements Serializable {
	
	private Integer genoclusterKey;
	private List<GridGenoclusterAllele> alleles;

}
