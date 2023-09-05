package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/* Is an accession ID / logical database pair for a vocabulary term.
 * Used by the shared vocabulary browser.
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class BrowserID implements Serializable {
	private String accID;
	private String logicalDB;

}
