package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/* Is a synonym / synonym type pair for a vocabulary term.
 * Used by the shared vocabulary browser.
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class BrowserSynonym implements Serializable {
	private String synonym;
	private String synonymType;
}
