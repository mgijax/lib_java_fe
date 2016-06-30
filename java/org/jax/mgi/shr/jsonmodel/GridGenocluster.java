package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;
import java.util.List;


/* Represents allele and marker data for a genocluster, specifically what's needed for the
 * Find Mice dialogs on the HMDC grid popup (and MP slimgrid popup).  This object is used
 * to send the data as JSON into a Solr index and to then represent it in the fewi
 * when the data is pulled back out.
 */
public class GridGenocluster implements Serializable {
	
	private Integer genoclusterKey;
	private List<GridGenoclusterAllele> alleles;
	
	public GridGenocluster() {}
	
	public GridGenocluster(Integer genoclusterKey, List<GridGenoclusterAllele> alleles) {
		this.genoclusterKey = genoclusterKey;
		this.alleles = alleles;
	}

	public Integer getGenoclusterKey() {
		return genoclusterKey;
	}

	public void setGenoclusterKey(Integer genoclusterKey) {
		this.genoclusterKey = genoclusterKey;
	}

	public List<GridGenoclusterAllele> getAlleles() {
		return alleles;
	}

	public void setAlleles(List<GridGenoclusterAllele> alleles) {
		this.alleles = alleles;
	}
}
