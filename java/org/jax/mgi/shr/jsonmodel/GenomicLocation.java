package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;


/* Is a single genomic location for a genome feature
 */
public class GenomicLocation implements Serializable {
	private String chromosome;
	private String startCoordinate;
	private String endCoordinate;
	private String strand;

	public GenomicLocation() {}

	public GenomicLocation(String chromosome, String startCoordinate, String endCoordinate, String strand) {
		this.chromosome = chromosome;
		this.startCoordinate = startCoordinate;
		this.endCoordinate = endCoordinate; 
		this.strand = strand;
	}

	public String getChromosome() {
		return chromosome;
	}

	public String getEndCoordinate() {
		return endCoordinate;
	}

	public String getStartCoordinate() {
		return startCoordinate;
	}

	public String getStrand() {
		return strand;
	}

	public void setChromosome(String chromosome) {
		this.chromosome = chromosome;
	}

	public void setEndCoordinate(String endCoordinate) {
		this.endCoordinate = endCoordinate;
	}

	public void setStartCoordinate(String startCoordinate) {
		this.startCoordinate = startCoordinate;
	}

	public void setStrand(String strand) {
		this.strand = strand;
	}

	@Override
	public String toString() {
		return "GenomicLocation [chromosome=" + chromosome + ", startCoordinate=" + startCoordinate + ", endCoordinate="
				+ endCoordinate + ", strand=" + strand + "]";
	}
}
