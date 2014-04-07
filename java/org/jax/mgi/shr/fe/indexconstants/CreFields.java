package org.jax.mgi.shr.fe.indexconstants;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Fields specific to cre indices
 */
public class CreFields 
{
	public static Map<String,String> SYSTEM_FIELDS = new LinkedHashMap<String,String>();
	static
	{
        // init SYSTEM fields
    	SYSTEM_FIELDS.put("adipose tissue","adiposeTissue");
    	SYSTEM_FIELDS.put("alimentary system","alimentarySystem");
        SYSTEM_FIELDS.put("branchial arches","brainchialArches");
        SYSTEM_FIELDS.put("cardiovascular system","cardiovascularSystem");
        SYSTEM_FIELDS.put("cavities and their linings","cavitiesAndLinings");
        SYSTEM_FIELDS.put("early embryo","earlyEmbryo");
        SYSTEM_FIELDS.put("embryo-other","embryoOther");
        SYSTEM_FIELDS.put("extraembryonic component","extraembryonicComponent");
        SYSTEM_FIELDS.put("head","head");
        SYSTEM_FIELDS.put("hemolymphoid system","hemolymphoidSystem");
        SYSTEM_FIELDS.put("integumental system","integumentalSystem");
        SYSTEM_FIELDS.put("limbs","limbs");
        SYSTEM_FIELDS.put("liver and biliary system","liverAndBiliarySystem");
        SYSTEM_FIELDS.put("mesenchyme","mesenchyme");
        SYSTEM_FIELDS.put("muscle","muscle");
        SYSTEM_FIELDS.put("nervous system","nervousSystem");
        SYSTEM_FIELDS.put("postnatal-other","postnatalOther");
        SYSTEM_FIELDS.put("renal and urinary system","renalAndUrinarySystem");
        SYSTEM_FIELDS.put("reproductive system","reproductiveSystem");
        SYSTEM_FIELDS.put("respiratory system","respiratorySystem");
        SYSTEM_FIELDS.put("sensory organs","sensoryOrgans");
        SYSTEM_FIELDS.put("skeletal system","sekeletalSystem");
        SYSTEM_FIELDS.put("tail","tail");
	}
}
