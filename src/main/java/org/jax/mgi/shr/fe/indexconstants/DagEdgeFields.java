package org.jax.mgi.shr.fe.indexconstants;

/*
 * schema fields for the vocabTermChild index
 */
public class DagEdgeFields {

	public static String CHILD_ID = "childId";
	public static String CHILD_TERM = "childTerm";
	public static String CHILD_TERM_KEY = "childTermKey";
	public static String PARENT_TERM_KEY = "parentTermKey";
	public static String PARENT_TERM = "parentTerm";
	public static String PARENT_ID = "parentId";
	public static String EMAPS_ID = "emapsId";
	public static String VOCAB = "vocab";
	public static String EDGE_TYPE = "edgeType";
	// edge types
	public static String DIRECT_EDGE_TYPE = "direct";
	public static String DESCENDENT_EDGE_TYPE = "descendent";
	
	// Query only fields
	public static String RELATED_ANCESTOR = "relatedAncestor";
	public static String RELATED_DESCENDENT = "relatedDescendent";
	
	// EMAPA DAG related fields
	public static String CHILD_START_STAGE = "childStartStage";
	public static String CHILD_END_STAGE = "childEndStage";
	public static String PARENT_START_STAGE = "parentStartStage";
	public static String PARENT_END_STAGE = "parentEndStage";
}
