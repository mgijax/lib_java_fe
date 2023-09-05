package org.jax.mgi.shr.jsonmodel;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/* Is a very simple representation of a mouse strain.  Can be used by any jsonmodel object that needs it.
 */
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class SimpleStrain implements Serializable {
	
	private String name;
	private String primaryID;
	private List<String> synonyms;
	private List<String> attributes;
	private List<AccessionID> accessionIDs;
	private Integer referenceCount;
}
