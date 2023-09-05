package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/* Is a single marker for display on the cDNA clone summary page.  This object is used
 * to send the data as JSON into a Solr index and to then represent it in the fewi
 * when the data is pulled back out.
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class CloneMarker implements Serializable {
	
	private String symbol;
	private String primaryID;
	private boolean isPutative = false;

}
