package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/* Is a child of a vocabulary term, storing enough info for display.
 * Used by the shared vocabulary browser.
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class BrowserChild implements Serializable {
	private String primaryID;
	private String logicalDB;
	private String term;
	private String edgeType;
	private Integer hasChildren;
	private Integer annotationCount;
	private String annotationLabel;
	private String annotationUrl;
	private String hasAnnotations;
}
