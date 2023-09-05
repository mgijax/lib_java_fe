package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/* Is a cDNA clone, specifically what's needed for the cDNA summary page that is accessed
 * from the marker detail page.  This object is used to send the data as JSON into a Solr
 * index and to then represent it in the fewi when the data is pulled back out.
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class Clone implements Serializable {
	private String primaryID;
	private String name;
	private List<String> collections;
	private String age;
	private String tissue;
	private String cellLine;
	private List<CloneMarker> markers;

}
