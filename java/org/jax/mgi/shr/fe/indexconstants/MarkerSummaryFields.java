package org.jax.mgi.shr.fe.indexconstants;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * Specific fields for marker summary
 */
public class MarkerSummaryFields {

	public static Map<String,String> NOMEN_FIELDS = new LinkedHashMap<String,String>();
	static
	{
        // init nomen fields in priority order
    	NOMEN_FIELDS.put("current symbol","currentSymbol");
    	NOMEN_FIELDS.put("current name","currentName");
        NOMEN_FIELDS.put("allele symbol","alleleSymbol");
        NOMEN_FIELDS.put("allele name","alleleName");
        NOMEN_FIELDS.put("old symbol","oldSymbol");
        NOMEN_FIELDS.put("old name","oldName");
        NOMEN_FIELDS.put("synonym","synonym");
        NOMEN_FIELDS.put("human synonym","humanSynonym");
        NOMEN_FIELDS.put("rat synonym","ratSynonym");
        NOMEN_FIELDS.put("related synonym","relatedSynonym");
        NOMEN_FIELDS.put("human symbol","humanSymbol");
        NOMEN_FIELDS.put("human name","humanName");
        NOMEN_FIELDS.put("rat symbol","ratSymbol");
        NOMEN_FIELDS.put("rhesus macaque symbol","rhesusMacaqueSymbol");
        NOMEN_FIELDS.put("cattle symbol","cattleSymbol");
        NOMEN_FIELDS.put("dog symbol","dogSymbol");
        NOMEN_FIELDS.put("zebrafish symbol","zebrafishSymbol");
        NOMEN_FIELDS.put("chicken symbol","chickenSymbol");
	}
}
