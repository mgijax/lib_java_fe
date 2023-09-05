package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/* Is a genetic mapping experiment, specifically what's needed for the mapping summary page that is accessed
 * from the marker detail page and the reference detail/summary page.  This object is used to send
 * the data as JSON into a Solr index and to then represent it in the fewi when the data is pulled back out.
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class MappingExperimentSummary implements Serializable {
	private String primaryID;
	private String type;
	private List<String> details;
	private String chromosome;
	private String jnumID;
	private String citation;

}
