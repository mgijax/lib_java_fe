package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/* Is a very simple representation of a marker.  Can be used by any jsonmodel object that needs it.
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class SimpleMarker implements Serializable {
	
	private String symbol;
	private String primaryID;

}
