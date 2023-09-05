package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/* Is a sequence (specifically what's needed for display on the sequence summary page). This object is used
 * to send the data as JSON into a Solr index and to then represent it in the fewi when the data is pulled
 * back out.
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class SimpleSequence implements Serializable {
	private Integer sequenceKey;
	private String primaryID;
	private String provider;
	private String sequenceType;
	private String length;
	private String species;
	private String strain;
	private String description;
	private String preferredGenbankID;
	private GenomicLocation location;
	private List<AccessionID> otherIDs;
	private List<String> cloneCollections;
	private List<SimpleMarker> markers;

}
