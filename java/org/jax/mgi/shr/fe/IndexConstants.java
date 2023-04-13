package org.jax.mgi.shr.fe;

public class IndexConstants {

	// Sequence
	public static final String SEQ_ID					= "accID";
	public static final String SEQ_KEY					= "sequenceKey";
	public static final String SEQ_TYPE_SORT			= "sequenceTypeSort";
	public static final String SEQ_PROVIDER				= "sequenceProvider";
	public static final String SEQ_PROVIDER_SORT		= "sequenceProviderSort";
	public static final String SEQ_LENGTH				= "sequenceLength";
	public static final String SEQ_SEQUENCE				= "sequence";
	public static final String SEQ_TYPE					= "sequenceType";
	public static final String SEQ_STRAIN				= "strain";

	// Marker
	public static final String MRK_KEY					= "markerKey";
	public static final String MRK_SYMBOL				= "markerSymbol";
	public static final String MRK_NAME					= "markerName";
	public static final String MRK_TYPE					= "markerType";
	public static final String MRK_STATUS				= "markerStatus";
	public static final String MRK_ORGANISM				= "markerOrganism";
	public static final String MRK_ID					= "markerID";
	public static final String MRK_PRIMARY_ID			= "markerPrimaryID";

	public static final String MRK_TERM					= "markerTerm";
	public static final String MRK_TERM_ID				= "markerTermID";
	public static final String MRK_TERM_ID_FOR_GXD		= "markerTermIDForGXD";
	public static final String MRK_BY_SYMBOL			= "byMrkSymbol";
	public static final String MRK_FEATURE_TYPE			= "featureType";

	// various symbols in marker index
    public static final String MRK_CURRENT_SYMBOL	= "currentSymbol";
    public static final String MRK_HUMAN_SYMBOL		= "humanSymbol";
    public static final String MRK_RAT_SYMBOL		= "ratSymbol";
    public static final String MRK_RHESUS_SYMBOL	= "rhesusMacaqueSymbol";
    public static final String MRK_CATTLE_SYMBOL	= "cattleSymbol";
    public static final String MRK_DOG_SYMBOL		= "dogSymbol";
    public static final String MRK_ZFIN_SYMBOL		= "zebrafishSymbol";
    public static final String MRK_CHICKEN_SYMBOL	= "chickenSymbol";
    public static final String MRK_CHIMP_SYMBOL		= "chimpanzeeSymbol";
    public static final String MRK_FROG_SYMBOL		= "westernClawedFrogSymbol";
	
	// Allele
	public static final String ALL_KEY					= "alleleKey";
	public static final String ALL_DRIVER				= "driver";
	public static final String ALL_SYMBOL				= "allSymbol";
	public static final String ALL_NAME					= "allName";
	public static final String ALL_TYPE					= "allType";
	public static final String ALL_SUBTYPE				= "allSubType";
	public static final String ALL_INDUCIBLE			= "inducible";
	public static final String ALL_IMSR_COUNT			= "imsrCount";
	public static final String ALL_ID					= "allID";
	public static final String ALL_IS_WILD_TYPE			= "isWildType";
	public static final String ALL_COLLECTION			= "collection";
	public static final String ALL_PHENO_ID				= "phenoId";
	public static final String ALL_PHENO_TEXT			= "phenoText";
	public static final String ALL_NOMEN				= "allNomen";
	public static final String ALL_HAS_DO				= "hasDO";
	public static final String ALL_IS_CELLLINE			= "isCellLine";
	public static final String ALL_MI_MARKER_IDS		= "mutationInvolvesMarkerIDs";
	public static final String ALL_MUTATION				= "mutation";

	// allele sorts
	public static final String ALL_TRANSMISSION_SORT		= "transmissionSort";
	public static final String ALL_SYMBOL_SORT				= "symbolSort";
	public static final String ALL_CHR_SORT					= "chrSort";
	public static final String ALL_DISEASE_SORT				= "diseaseSort";
	public static final String ALL_TYPE_SORT					= "alleleTypeSort";
	public static final String ALL_DRIVER_SORT				= "driverSort";
	public static final String ALL_REFERENCE_COUNT_SORT	= "referenceCountSort";

	// Reference
	public static final String REF_KEY								= "referenceKey";
	public static final String REF_ID								= "accID";
	public static final String REF_JOURNAL							= "journal";
	public static final String REF_JOURNAL_SORT					= "journalSort";
	public static final String REF_JOURNAL_SORT_LOWER 			= "journalSortLower";
	public static final String REF_JOURNAL_FACET					= "journalFacet";
	public static final String REF_TITLE							= "title";
	public static final String REF_YEAR								= "year";
	public static final String REF_ABSTRACT						= "abstract";
	public static final String REF_ISSUE							= "issue";
	public static final String REF_VOLUME							= "volume";
	public static final String REF_FIRST_AUTHOR					= "firstAuthor";
	public static final String REF_LAST_AUTHOR					= "lastAuthor";
	public static final String REF_AUTHOR							= "author";
	public static final String REF_AUTHOR_SORT					= "authorSort";
	public static final String REF_AUTHOR_FACET					= "authorFacet";
	public static final String REF_AUTHOR_FORMATTED				= "authorsFormatted";
	public static final String REF_HAS_DATA						= "hasData";
	public static final String REF_ABSTRACT_STEMMED				= "abstractStemmed";
	public static final String REF_ABSTRACT_UNSTEMMED			= "abstractUnStemmed";
	public static final String REF_TITLE_STEMMED					= "titleStemmed";
	public static final String REF_TITLE_UNSTEMMED				= "titleUnStemmed";
	public static final String REF_TITLE_ABSTRACT_STEMMED		= "titleAbstractStemmed";
	public static final String REF_TITLE_ABSTRACT_UNSTEMMED	= "titleAbstractUnStemmed";
	public static final String REF_DISEASE_ID						= "diseaseId";
	public static final String REF_DISEASE_RELEVANT_MARKER_ID = "diseaseRelevantMarkerId";
	public static final String REF_GO_MARKER_ID					= "goMarkerId";
	public static final String REF_PHENO_MARKER_ID				= "phenoMarkerId";
	public static final String REF_GROUPING						= "grouping";

	// Autocomplete Fields
	public static final String AC_FOR_GXD			= "forGXD";
	public static final String AC_IS_GENERATED	= "isGenerated";
	public static final String AC_UNIQUE_KEY		= "acUniqueKey";

	// GXD Lit Index Keys
	public static final String GXD_LIT_SINGLE_KEY		= "compressedKey";
	public static final String GXD_LIT_AGE					= "age";
	public static final String GXD_LIT_ASSAY_TYPE		= "assayType";
	public static final String GXD_LIT_AGE_ASSAY_TYPE_PAIR = "ageAssayTypePair";
	public static final String GXD_MRK_NOMEN				= "nomen";
	public static final String GXD_MRK_NOMEN_BEGINS		= "nomenNGram";
	public static final String GXD_MRK_SYMBOL				= "symbolAndSynonyms";
	public static final String GXD_LIT_FC_ASSAY_TYPE	= "fullCodedAssayType";
	public static final String GXD_LIT_THEILER_STAGE	= "theilerStage";

	// other GXD
	public static final String GXD_START_STAGE	= "startStage";
	public static final String GXD_END_STAGE	= "endStage";
	public static final String GXD_SYSTEM_FACET = "anatomicalSystem";
	public static final String GXD_ASSAY_TYPE_FACET = "assayType";
	public static final String GXD_WILDTYPE_FACET = "isWildType";
	public static final String GXD_DETECTED_FACET = "detectionLevel";
	public static final String GXD_THEILER_STAGE_FACET = "theilerStage";
	public static final String GXD_MARKER_TYPE_FACET = "featureTypes";
	public static final String GXD_MP_FACET = "mpHeaders";
	public static final String GXD_DO_FACET = "doHeaders";
	public static final String GXD_GO_FACET = "goHeaders";
	public static final String GXD_TMPLEVEL_FACET = "tpmLevel";
	
	
	// General
	public static final String ACC_ID				= "accID";
	public static final String JNUM_ID				= "jnumID";
	public static final String MGI_ID				= "mgiID";
	public static final String PUBMED_ID			= "pubMedID";
	public static final String UNIQUE_KEY			= "uniqueKey";

	// Counts
	public static final String GO_ANNOT_COUNT		= "goAnnotationCount";
	public static final String PRB_COUNT			= "probe_count";
	public static final String MRK_COUNT			= "marker_count";
	public static final String ALL_COUNT			= "alleleCount";
	public static final String SEQ_COUNT			= "sequenceCount";
	public static final String ORTHO_COUNT			= "orthologCount";
	public static final String MAP_EXPT_COUNT		= "mappingExptCount";
	public static final String GXD_INDEX_COUNT	= "gxdIndexCount";
	public static final String GXD_RESULT_COUNT	= "gxdResultCount";
	public static final String GXD_STRUCT_COUNT	= "gxdStructureCount";
	public static final String GXD_ASSAY_COUNT	= "gxdAssayCount";

	// Vocabulary
	public static final String VOC_TERM				= "vocTerm";
	public static final String VOC_ID				= "vocID";
	public static final String DAG_TYPE				= "dagType";
	public static final String VOC_VOCAB			= "vocab";
	public static final String VOC_QUALIFIER		= "qualifier";
	public static final String VOC_DAG_NAME		= "dagName";
	public static final String VOC_BY_DAG_STRUCT	= "byDagStruct";
	public static final String VOC_BY_DAG_TERM		= "byDagTerm";
	public static final String BY_MRK_DAG_TERM		= "byMarkerDagTerm";

	// Annotation Constants
	public static final String ANNOTATION_KEY		= "annotationKey";
	public static final String TERM_ID				= "termID";
	public static final String TERM				= "term";
	public static final String ANNOTATED_TERM_ID	= "annotatedTermID";
	public static final String BY_GENOTYPE_TERM	= "byGenotypeTerm";
	public static final String BY_EVIDENCE_CODE		= "byEvidenceCode";
	public static final String BY_EVIDENCE_TERM		= "byEvidenceTerm";
	public static final String BY_ISOFORM			= "byIsoform";
	public static final String EVIDENCE_CATEGORY	= "evidenceCategory";
	public static final String SLIM_TERM		= "slimTerm";
	public static final String ANATOMY_ID		= "anatomyID";
	public static final String PARENT_ANATOMY_ID	= "parentAnatomyID";
	public static final String ANATOMY_TERM		= "anatomyTerm";
	public static final String ANCESTOR_ANATOMY_KEY	= "ancestorAnatomyKey";
	public static final String ANNOTATION_COUNT = "annotationCount";
	public static final String IS_NORMAL		= "isNormal";
	public static final String HAS_BACKGROUND_SENSITIVITY = "hasBackgroundSensitivity";
	public static final String BY_GENOCLUSTER	= "byGenocluster";
	public static final String BY_REFERENCE		= "byReference";
	public static final String BY_CATEGORY		= "byCategory";

	// Genotypes
	public static final String GENOTYPE_KEY		= "genotypeKey";
	public static final String ALLELE_PAIRS		= "allelePairs";
	public static final String BACKGROUND_STRAIN	= "backgroundStrain";

	// A special count to denote that no curated data was found
	public static final String NO_CURATED_DATA		= "noDataCurated";

	// Images
	public static final String IMAGE_KEY			= "imageKey";
	public static final String IMAGE_ID			= "imageID";
	public static final String IMAGE_CLASS			= "imageClass";
	public static final String IMAGE_CLASS_PHENO	= "Phenotypes";
	public static final String IMAGE_CLASS_GXD		= "Expression";
	public static final String IS_THUMB			= "isThumb";
	public static final String PANESET_KEY			= "panesetKey";

	// General Sort
	public static final String BY_DEFAULT			= "byDefaultSort";

	// Structure Auto Complete
	public static final String STRUCTUREAC_KEY = "structureKey";
	public static final String STRUCTUREAC_STRUCTURE = "structure";
	public static final String STRUCTUREAC_SYNONYM = "synonym";
	public static final String STRUCTUREAC_QUERYTEXT = "queryText";
	public static final String STRUCTUREAC_IS_STRICT_SYNONYM = "isStrictSynonym";
	public static final String STRUCTUREAC_BY_SYNONYM = "by_synonym";
	public static final String STRUCTUREAC_HAS_CRE = "hasCre";
	public static final String STRUCTUREAC_HAS_GXDHT = "hasGxdHT";
	public static final String STRUCTUREAC_START_STAGE = "startStage";
	public static final String STRUCTUREAC_END_STAGE = "endStage";
	public static final String STRUCTUREAC_CROSSREF = "crossRef";

	// Vocab Term Auto Complete Fields
	public static final String VOCABAC_KEY = "uniqueKey";
	public static final String VOCABAC_TERM_KEY = "termKey";
	public static final String VOCABAC_TERM_ID = "termId";
	public static final String VOCABAC_TERM = "term";
	public static final String VOCABAC_BY_TERM = "byTerm";
	public static final String VOCABAC_BY_ORIGINAL_TERM = "byOriginalTerm";
	public static final String VOCABAC_TERM_LENGTH = "termLength";
	public static final String VOCABAC_IS_SYNONYM = "isSynonym";
	public static final String VOCABAC_ORIGINAL_TERM = "originalTerm";
	public static final String VOCABAC_ROOT_VOCAB = "vocabName";
	public static final String VOCABAC_DERIVED_TERMS = "derivedTerms";
	public static final String VOCABAC_VOCAB = "displayVocab";
	public static final String VOCABAC_MARKER_COUNT = "markerCount";
	public static final String VOCABAC_EXPRESSION_MARKER_COUNT = "expressionMarkerCount";
	public static final String VOCABAC_GXDLIT_MARKER_COUNT = "gxdlitMarkerCount";

	// Homology constants
	public static final String HOMOLOGY_ID = "homologyID";
	public static final String HOMOLOGY_KEY = "homologyKey";

	// Disease constants
	public static final String DISEASE_ID = "diseaseID";
	public static final String DISEASE_KEY = "diseaseKey";
	public static final String GENOCLUSTER_KEY = "genoclusterKey";

	// ordering of records (not specific to actual DNA/Poly sequences)
	public static final String SEQUENCE_NUM = "sequenceNum";

	// locations
	public static final String START_COORD = "startCoord";
	public static final String END_COORD = "endCoord";
	public static final String CHROMOSOME = "chromosome";
	public static final String GENETIC_CHROMOSOME = "genetic_chromosome";
	public static final String GENOMIC_CHROMOSOME = "genomic_chromosome";
	public static final String CM_OFFSET = "cm";
	public static final String CYTOGENETIC_OFFSET = "cytogenetic";
	public static final String STRAND = "strand";
	public static final String COORD_TYPE = "coordType";

	// regulates relationships

	public static final String REG_KEY = "regKey";
	public static final String ORGANIZER_ID = "organizerID";
	public static final String ORGANIZER_SYMBOL = "organizerSymbol";
	public static final String PARTICIPANT_ID = "participantID";
	public static final String PARTICIPANT_SYMBOL = "participantSymbol";
	public static final String RELATIONSHIP_TERM = "relationshipTerm";
	public static final String EVIDENCE_CODE = "evidenceCode";
	public static final String VALIDATION = "validation";
	public static final String VALIDATION_SORTABLE = "validation_sortable";
	public static final String SCORE_VALUE = "score_value";
	public static final String SCORE_SOURCE = "score_source";
	public static final String SCORE_SOURCE_SORTABLE = "score_source_sortable";
	public static final String SCORE_NUMERIC = "score_numeric";
	public static final String SCORE_SORTABLE = "score_sortable";
	public static final String SCORE_FILTERABLE = "score_filterable";
	public static final String MATURE_TRANSCRIPT = "matureTranscript";
	public static final String PARTICIPANT_PRODUCT_ID = "participantProductID";
	public static final String ORGANIZER_PRODUCT_ID = "organizerProductID";
	public static final String ALGORITHM = "algorithm";
	public static final String OTHER_REFERENCES = "otherReferences";
	public static final String NOTES = "notes";
	public static final String PROPERTIES = "properties";
	public static final String BY_MARKER_SYMBOL = "byMarkerSymbol";
	public static final String BY_ORGANIZER_SYMBOL = "byOrganizerSymbol";
	public static final String BY_PARTICIPANT_SYMBOL = "byParticipantSymbol";
	public static final String BY_JNUM_ID = "byJnumID";
	
	// SNP constants
	public static final String SNP_CONSENSUSSNPID = "consensussnp_accid";
	public static final String SNP_STARTCOORDINATE = "startcoordinate";
	public static final String SNP_VARIATIONCLASS = "varclass";
	public static final String SNP_FUNCTIONCLASS = "fxn";
	public static final String SNP_MARKERID = "marker_accid";
	public static final String SNP_STRAINS = "strains";
	public static final String SNP_SAME_STRAINS = "samestrains";
	public static final String SNP_DIFF_STRAINS = "diffstrains";
	public static final String SNP_JSONSTRING = "objectJSONData";
	
	// strain constants
	public static final String STRAIN_KEY = "strainKey";
	public static final String STRAIN_NAME = "strainName";
	public static final String STRAIN_NAME_LOWER = "strainNameLower";
	public static final String STRAIN_TYPE = "strainType";
	public static final String STRAIN = "strain";
	public static final String STRAIN_ID = "strainID";
	public static final String STRAIN_ATTRIBUTE = "attribute";
	public static final String STRAIN_ATTRIBUTE_LOWER = "attributeLower";
	public static final String STRAIN_IS_SEQUENCED = "isSequenced";
	public static final String STRAIN_GROUPS = "groups";
	public static final String STRAIN_TAGS = "tags";

	// cDNA clones
	public static final String CDNA_KEY = "cloneKey";
	public static final String CDNA_MARKER_ID = "markerID";
	public static final String CDNA_SEQUENCE_NUM = "sequenceNum";
	public static final String CDNA_CLONE = "clone";
	
	// probes
	public static final String PRB_KEY = "probeKey";
	public static final String PRB_SEGMENT_TYPE = "segmentType";
	public static final String PRB_REFERENCE_ID = "referenceID";
	public static final String PRB_MARKER_ID = "markerID";
	public static final String PRB_BY_TYPE = "byType";
	public static final String PRB_BY_NAME = "byName";
	public static final String PRB_PROBE = "probe";
	
	// genetic mapping experiments; also uses MRK_ID and BY_DEFAULT
	public static final String MLD_EXPERIMENT_KEY = "experimentKey";
	public static final String MLD_EXPERIMENT = "experiment";
	public static final String MLD_REFERENCE_ID = "referenceID";
	
	// shared vocabulary browser
	public static final String VB_PRIMARY_ID = "primaryID";
	public static final String VB_ACC_ID = "accID";
	public static final String VB_TERM = "term";
	public static final String VB_SYNONYM = "synonym";
	public static final String VB_PARENT_ID = "parentID";
	public static final String VB_SEQUENCE_NUM = "sequenceNum";
	public static final String VB_BROWSER_TERM = "browserTerm";
	public static final String VB_VOCAB_NAME = "vocabName";
	public static final String VB_DAG_NAME = "dagName";
	public static final String VB_CROSSREF = "crossRef";
	
	// expression counts and flags
	public static final String ALL_RESULTS = "allResults";
	public static final String DETECTED_RESULTS = "detectedResults";
	public static final String NOT_DETECTED_RESULTS = "notDetectedResults";
	public static final String ANY_AMBIGUOUS = "anyAmbiguous";
	public static final String AMBIGUOUS_OR_NOT_DETECTED_DESCENDANTS = "ambiguousOrNotDetectedDescendants";

	// generic stuff
	public static final String ORGANISM = "organism";
	public static final String SYMBOL = "symbol";
	public static final String COLUMN_ID = "columnID";
	public static final String BY_COLUMN = "byColumn";
	public static final String CELL_TYPE = "cellType";
	public static final String CHILDREN = "children";

	// quick search buckets 1 and 2 (genome features and term/strain)
	public static final String QS_PRIMARY_ID = "primaryID";
	public static final String QS_DETAIL_URI = "detailUri";
	public static final String QS_SEQUENCE_NUM = "sequenceNum";
	public static final String QS_SYMBOL = "symbol";
	public static final String QS_NAME = "name";
	public static final String QS_FEATURE_TYPE = "featureType";
	public static final String QS_IS_MARKER = "isMarker";
	public static final String QS_CHROMOSOME = "chromosome";
	public static final String QS_LOCATION = "location";
	public static final String QS_START_COORD = "startCoord";
	public static final String QS_END_COORD = "endCoord";
	public static final String QS_STRAND = "strand";

	public static final String QS_SEARCH_TERM_EXACT = "searchTermExact";
	public static final String QS_SEARCH_TERM_INEXACT = "searchTermInexact";
	public static final String QS_SEARCH_TERM_STEMMED = "searchTermStemmed";
	public static final String QS_SEARCH_TERM_DISPLAY = "searchTermDisplay";
	public static final String QS_SEARCH_TERM_TYPE = "searchTermType";
	public static final String QS_SEARCH_TERM_WEIGHT = "searchTermWeight";

	public static final String QS_SEARCH_COORD_TYPE = "searchCoordType";
	public static final String QS_SEARCH_CHROMOSOME = "searchChromosome";
	public static final String QS_SEARCH_START_COORD = "searchStartCoord";
	public static final String QS_SEARCH_END_COORD = "searchEndCoord";
	public static final String QS_COORD_SEQUENCE_NUM = "coordSequenceNum";

	public static final String QS_OBJECT_TYPE = "objectType";			// special for other bucket:
	public static final String QS_OBJECT_SUBTYPE = "objectSubType";		// special for other bucket:
	public static final String QS_TERM = "term";						// special for vocab bucket:
	public static final String QS_TERM_TYPE = "termType";
	public static final String QS_VOCAB_NAME = "vocabName";				// for display in QS
	public static final String QS_RAW_VOCAB_NAME = "rawVocabName";		// for certain filtering
	public static final String QS_ANNOTATION_COUNT = "annotationCount";
	public static final String QS_ANNOTATION_TEXT = "annotationText";
	public static final String QS_ANNOTATION_URI = "annotationUri";

	public static final String QS_GO_PROCESS_FACETS = "goProcessFacets";
	public static final String QS_GO_FUNCTION_FACETS = "goFunctionFacets";
	public static final String QS_GO_COMPONENT_FACETS = "goComponentFacets";
	public static final String QS_DISEASE_FACETS = "diseaseFacets";
	public static final String QS_PHENOTYPE_FACETS = "phenotypeFacets";
	public static final String QS_MARKER_TYPE_FACETS = "markerTypeFacets";
	public static final String QS_EXPRESSION_FACETS = "expressionFacets";
	
	public static final String QS_ATTRIBUTES = "attributes";			// special for strain bucket
	public static final String QS_REFERENCE_COUNT = "referenceCount";
	public static final String QS_REFERENCE_URI = "referenceUri";
	public static final String QS_IMSR_ID = "imsrID";

	// These four should probably be moved to SearchConstants.java in the fewi.
	public static final String QS_SEARCHTYPE_EXACT_PHRASE = "exactPhrase";
	public static final String QS_SEARCHTYPE_KEYWORDS = "keywords";
	public static final String QS_SEARCHTYPE_MOUSE_COORD = "mouseLocation";
	public static final String QS_SEARCHTYPE_HUMAN_COORD = "humanLocation";

	public static final String SCORE = "score";							// raw Solr score
}
