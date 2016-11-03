package org.jax.mgi.shr.fe.indexconstants;

public class DiseasePortalFields
{
	 // Disease Portal Index

	// uniquely identifies a "basic search unit" (BSU) for the grid -- a genocluster
	// for mouse data, or a marker/disease pair for human data
	public static final String GRID_KEY = "gridKey";

	//cluster
	public static final String HOMOLOGENE_ID = "homologeneId";
	public static final String HOMOLOGY_SOURCE = "homologySource";
	public static final String GRID_CLUSTER_KEY = "gridClusterKey";
	public static final String GRID_MOUSE_SYMBOLS = "gridMouseSymbols";
	public static final String GRID_HUMAN_SYMBOLS = "gridHumanSymbols";
	public static final String ALLELE_PAIRS = "allelePairs";

	public static final String GRID_BY_HUMAN_LOCATION = "gridByHumanLocation";	
	public static final String GRID_BY_MOUSE_LOCATION = "gridByMouseLocation";
	public static final String IS_CONDITIONAL = "isConditional";
	public static final String IMSR_ALLELES = "imsrAlleles";
	
	// Homology cluster key is used for linking to cluster pages; This is
	// separate from the grid cluster key, because that one is used for
	// grouping results and we do not want to group in markers that have
	// no annotations for the grid.  (It causes many marker symbols to 
	// disappear from the grid.)
	public static final String HOMOLOGY_CLUSTER_KEY = "homologyClusterKey";
	
	//marker
	public static final String MARKER_KEY = "markerKey";
	public static final String MOUSE_COORDINATE = "mc";
	public static final String HUMAN_COORDINATE = "hc";
	public static final String ORGANISM = "organism";
	public static final String MARKER_SYMBOL = "markerSymbol";
	public static final String MARKER_MGI_ID = "markerMgiId";
	public static final String MARKER_ID = "mI";
	public static final String MARKER_SYNONYM = "mSy";
	public static final String MARKER_SYNONYM_SINGLE_TOKEN = "mSySingleToken";
	
	public static final String ORTHOLOG_ID = "oI";
	public static final String ORTHOLOG_NOMEN = "oN";
	public static final String ORTHOLOG_SYMBOL = "oS";
	public static final String ORTHOLOG_SYNONYM = "oSy";
	
	public static final String HUMAN_DISEASE_JOIN_KEY = "humanDiseaseKey";
	
	// aggregate marker fields
	// 		contains name, symbol,synonyms, and orthologNomen
	public static final String MARKER_NOMEN_SEARCH = "mnS";
	// 		contains markerId and orthologId
	public static final String MARKER_ID_SEARCH = "miS";
	
	// marker - readonly fields
	public static final String MARKER_NAME = "markerName";
	public static final String LOCATION_DISPLAY = "locationDisplay";
	public static final String COORDINATE_DISPLAY = "coordinateDisplay";
	public static final String BUILD_IDENTIFIER = "coordinateBuild";
	public static final String MARKER_FEATURE_TYPE = "featureType";
	public static final String MARKER_DISEASE = "markerDisease";
	public static final String MARKER_SYSTEM = "markerSystem";
	public static final String MOUSE_MARKER_SYSTEM = "mouseMarkerSystem";
	public static final String HUMAN_MARKER_SYSTEM = "humanMarkerSystem";
	public static final String MARKER_ALL_REF_COUNT = "markerAllRefCount";
	public static final String MARKER_DISEASE_REF_COUNT = "markerDiseaseRefCount";
	public static final String MARKER_IMSR_COUNT = "markerIMSRCount";
	
	// filterable fields (includes all feature types for a marker's
	// HomoloGene cluster)
	public static final String FILTERABLE_FEATURE_TYPES = "filterableFeatureTypes";

	// marker sort fields
	public static final String BY_MARKER_SYMBOL = "byMarkerSymbol";
	public static final String BY_MARKER_TYPE = "byMarkerType";
	public static final String BY_MARKER_ORGANISM = "byMarkerOrganism";
	public static final String BY_MARKER_LOCATION = "byMarkerLocation";
	public static final String BY_HOMOLOGENE_ID = "byHomologeneId";
	
	// genotype
	public static final String GENO_CLUSTER_KEY = "genoClusterKey";
    public static final String GENOTYPE_KEY = "genotypeKey";
    public static final String GENOTYPE_TYPE = "genotypeType";

	public static final String ANNOT_COUNT = "annotCount";
	public static final String HUMAN_ANNOT_COUNT = "humanAnnotCount";
    
    // sorts for genotypes
    public static final String BY_GENOCLUSTER = "byGenoCluster";
    
    // source term (when one annotation is derived from another)
    public static final String SOURCE_TERM = "sourceTerm";
    public static final String SOURCE_TERM_ID = "sourceTermId";

    // term
    public static final String TERM = "term";
    public static final String TERM_GROUP = "termGroup";
    public static final String TERM_ID = "termId";
    public static final String TERM_ID_GROUP = "termIdGroup";
    public static final String TERM_TYPE = "termType";
    public static final String LOCATION = "location";
    public static final String VOCAB_NAME = "vocabName";
    public static final String TERM_HEADER = "termHeader";
    public static final String DISEASE_REF_COUNT = "diseaseRefCount";
    public static final String TERM_SYNONYM = "tSy";
    public static final String TERM_ANCESTOR = "tA";
    public static final String TERM_ANCESTOR_TEXT = "tAtext";
    public static final String TERM_ANCESTOR_ID = "tAid";
    public static final String TERM_ALT_ID = "altTermId";
    public static final String MP_TERM_FOR_HUMAN_DISEASE = "mpHD";
    public static final String MP_TERM_FOR_SS_DISEASE = "mpSSD";
    public static final String MP_TERM_FOR_SS_DISEASE_TEXT = "mpSSDtext";
    public static final String MP_TERM_FOR_SS_DISEASE_ID = "mpSSDid";
    public static final String MP_TERM_FOR_DISEASE = "mpD";
    public static final String MP_TERM_FOR_DISEASE_TEXT = "mpDtext";
    public static final String MP_TERM_FOR_DISEASE_ID = "mpDid";
    public static final String MP_TERM_FOR_PHENOTYPE = "mpP";
    public static final String DISEASE_TERM_FOR_PHENOTYPE = "dP";
    public static final String DISEASE_TERM_FOR_DISEASE = "dD";
    public static final String DISEASE_TERM_FOR_DISEASE_TEXT = "dDtext";
    public static final String DISEASE_TERM_FOR_DISEASE_ID = "dDid";
    public static final String DISEASE_MODEL_COUNTS = "diseaseModelCounts";
    public static final String TERM_MOUSESYMBOL = "termMouseSymbol";
    public static final String TERM_HUMANSYMBOL = "termHumanSymbol";
    public static final String HPO_TEXT = "hpoText";
    public static final String HPO_ID = "hpoId";
    
    // in annotation index
    public static final String TERM_QUALIFIER = "qualifier";
    public static final String ANNOTATION_COUNT = "annotCount";
    public static final String BACKGROUND_SENSITIVE = "backgroundSensitive";
    
    // expressed component marker data
    public static final String EC_SYMBOL = "ecSymbol";
    public static final String EC_NAME = "ecName";
    public static final String EC_SYNONYM = "ecSynonym";
    public static final String EC_SYNONYM_SINGLE_TOKEN = "ecSynonymSingleToken";
    public static final String EC_ID = "ecId";
    
    // term sorts
    public static final String BY_TERM_NAME = "byTermName";
    public static final String BY_TERM_DAG = "byTermDag";
    public static final String BY_MP_HEADER = "byMpHeader";
    public static final String BY_TERM_HEADER = "byTermHeader"; 
    
    // aggregate term fields
    // contains term_id + term_alt_id
    public static final String TERM_ID_SEARCH = "tiS";
    // contains term, term_id,term_synonym,term_ancestor,term_alt_id
    public static final String TERM_SEARCH = "tS";
    // contains term, term_synonym, term_ancestor (terms and synonyms only) for highlighting
    public static final String TERM_TEXT_HIGHLIGHT = "tsHtext";
    // contains term_id, term_ancestor ID, term_alt_id (IDs only) for highlighting
    public static final String TERM_ID_HIGHLIGHT = "tsHid";
    // contains term, term_synonym, term_ancestor (terms and synonyms only)
    public static final String TERM_SEARCH_TEXT = "tStext";
    // contains term_id, term_ancestor ID, term_alt_id (IDs only)
    public static final String TERM_SEARCH_ID = "tSid";
    // contains term, term_id,term_synonym,term_alt_id
    public static final String TERM_SEARCH_HIGHLIGHT = "tSh";
    // contains termSearch + mpTermForDisease
    public static final String TERM_SEARCH_FOR_DISEASE = "tsD";
    // contains termSearch + mpTermForDisease (terms and synonyms only)
    public static final String TERM_SEARCH_FOR_DISEASE_TEXT = "tsDtext";
    // contains termSearch + mpTermForDisease (IDs only)
    public static final String TERM_SEARCH_FOR_DISEASE_ID = "tsDid";
    // contains termSearch + mpTermForSSDisease
    public static final String TERM_SEARCH_FOR_GRID_COLUMNS = "tsG";
    // contains termSearch + mpTermForSSDisease (terms and synonyms only)
    public static final String TERM_SEARCH_FOR_GRID_COLUMNS_TEXT = "tsGtext";
    // contains termSearch + mpTermForSSDisease (IDs only)
    public static final String TERM_SEARCH_FOR_GRID_COLUMNS_ID = "tsGid";

    public static final String TERM_SEARCH_GENE_UPLOAD = "gene_upload";
    
    public static final String UNIQUE_KEY = "uniqueKey";
}
