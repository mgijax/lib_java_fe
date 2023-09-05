package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/* Is a single marker for display on the HMDC's grid display.  This object is used
 * to send the data as JSON into a Solr index and to then represent it in the fewi
 * when the data is pulled back out.
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class GridMarker implements Serializable {
	
	private String symbol;
	private String primaryID;
	private String name;
	private String featureType;
	private Integer clusterKey;
	private String title;

}
