package org.jax.mgi.shr.fe;

public class IndexConstants {

    // Sequence
    public static final String SEQ_ID                   = "accID";
    public static final String SEQ_KEY                  = "sequenceKey";
    public static final String SEQ_TYPE_SORT            = "sequenceTypeSort";
    public static final String SEQ_PROVIDER             = "sequenceProvider";
    public static final String SEQ_PROVIDER_SORT        = "sequenceProviderSort";
    public static final String SEQ_LENGTH               = "sequenceLength";

    // Marker
    public static final String MRK_KEY                  = "markerKey";
    public static final String MRK_SYMBOL               = "markerSymbol";
    public static final String MRK_NAME                 = "markerName";
    public static final String MRK_TYPE                 = "markerType";
    public static final String MRK_STATUS               = "markerStatus";
    public static final String MRK_ORGANISM             = "markerOrganism";
    public static final String MRK_ID                   = "markerID";
    public static final String MRK_PRIMARY_ID			= "markerPrimaryID";

    public static final String MRK_TERM                 = "markerTerm";
    public static final String MRK_TERM_ID              = "markerTermID";
    public static final String MRK_TERM_ID_FOR_GXD      = "markerTermIDForGXD";
    public static final String MRK_BY_SYMBOL            = "byMrkSymbol";

    // Allele
    public static final String ALL_KEY                  = "alleleKey";
    public static final String ALL_DRIVER               = "driver";
    public static final String ALL_SYMBOL               = "allSymbol";
    public static final String ALL_NAME                 = "allName";
    public static final String ALL_TYPE                 = "allType";
    public static final String ALL_SYMBOL_SORT          = "symbolSort";
    public static final String ALL_TYPE_SORT            = "alleleTypeSort";
    public static final String ALL_DRIVER_SORT          = "driverSort";
    public static final String ALL_REFERENCE_COUNT_SORT = "referenceCountSort";
    public static final String ALL_INDUCIBLE            = "inducible";
    public static final String ALL_IMSR_COUNT           = "imsrCount";
    public static final String ALL_ID                   = "allID";

    // Cre Allele
    public static final String CRE_ALL_SYSTEM                   = "system";
    public static final String CRE_ALL_SYSTEM_KEY               = "alleleSystemKey";
    public static final String CRE_SYSTEM_KEY                   = "systemKey";
    public static final String CRE_ASSAY_RESULT_KEY             = "resultKey";
    public static final String CRE_DETECTED_COUNT               = "detectedCount";
    public static final String CRE_NOT_DETECTED_COUNT           = "notDetectedCount";
    public static final String CRE_DETECTED_TOTAL_COUNT         = "detectedTotalCount";

    // Cre sorting (column names)
    public static final String CRE_BY_STRUCTURE                 = "byStructure";
    public static final String CRE_BY_AGE                       = "byAge";
    public static final String CRE_BY_LEVEL                     = "byLevel";
    public static final String CRE_BY_PATTERN                   = "byPattern";
    public static final String CRE_BY_JNUM_ID                   = "byJnumID";
    public static final String CRE_BY_ASSAY_TYPE                = "byAssayType";
    public static final String CRE_BY_REPORTER_GENE             = "byReporterGene";
    public static final String CRE_BY_DETECTION_METHOD          = "byDetectionMethod";
    public static final String CRE_BY_ASSAY_NOTE                = "byAssayNote";
    public static final String CRE_BY_ALLELIC_COMPOSITION       = "byAllelicComposition";
    public static final String CRE_BY_SEX                       = "bySex";
    public static final String CRE_BY_SPECIMEN_NOTE             = "bySpecimenNote";
    public static final String CRE_BY_RESULT_NOTE               = "byResultNote";
    
    // Reference
    public static final String REF_KEY              = "referenceKey";
    public static final String REF_ID               = "accID";
    public static final String REF_JOURNAL          = "journal";
    public static final String REF_JOURNAL_SORT     = "journalSort";
    public static final String REF_JOURNAL_SORT_LOWER = "journalSortLower";
    public static final String REF_JOURNAL_FACET    = "journalFacet";
    public static final String REF_TITLE            = "title";
    public static final String REF_YEAR             = "year";
    public static final String REF_ABSTRACT         = "abstract";
    public static final String REF_ISSUE            = "issue";
    public static final String REF_VOLUME           = "volume";
    public static final String REF_FIRST_AUTHOR     = "firstAuthor";
    public static final String REF_LAST_AUTHOR      = "lastAuthor";
    public static final String REF_AUTHOR           = "author";
    public static final String REF_AUTHOR_SORT      = "authorSort";
    public static final String REF_AUTHOR_FACET     = "authorFacet";
    public static final String REF_AUTHOR_FORMATTED = "authorsFormatted";
    public static final String REF_HAS_DATA         = "hasData";
    public static final String REF_ABSTRACT_STEMMED = "abstractStemmed";
    public static final String REF_ABSTRACT_UNSTEMMED = "abstractUnStemmed";
    public static final String REF_TITLE_STEMMED = "titleStemmed";
    public static final String REF_TITLE_UNSTEMMED = "titleUnStemmed";
    public static final String REF_TITLE_ABSTRACT_STEMMED = "titleAbstractStemmed";
    public static final String REF_TITLE_ABSTRACT_UNSTEMMED = "titleAbstractUnStemmed";

    // Autocomplete Fields
    public static final String AC_FOR_GXD            = "forGXD";
    public static final String AC_IS_GENERATED        = "isGenerated";
    public static final String AC_UNIQUE_KEY        = "acUniqueKey";

    // GXD Lit Index Keys
    public static final String GXD_LIT_SINGLE_KEY   = "compressedKey";
    public static final String GXD_LIT_AGE          = "age";
    public static final String GXD_LIT_ASSAY_TYPE   = "assayType";
    public static final String GXD_LIT_AGE_ASSAY_TYPE_PAIR = "ageAssayTypePair";
    public static final String GXD_MRK_NOMEN        = "nomen";
    public static final String GXD_MRK_NOMEN_BEGINS = "nomenNGram";
    public static final String GXD_MRK_SYMBOL       = "symbolAndSynonyms";
    public static final String GXD_LIT_FC_ASSAY_TYPE = "fullCodedAssayType";
    public static final String GXD_LIT_THEILER_STAGE = "theilerStage";

    // General
    public static final String JNUM_ID              = "jnumID";
    public static final String MGI_ID               = "mgiID";
    public static final String PUBMED_ID            = "pubMedID";
    public static final String UNIQUE_KEY           = "uniqueKey";

    // Counts
    public static final String GO_ANNOT_COUNT       = "goAnnotationCount";
    public static final String PRB_COUNT            = "probe_count";
    public static final String MRK_COUNT            = "marker_count";
    public static final String ALL_COUNT            = "alleleCount";
    public static final String SEQ_COUNT            = "sequenceCount";
    public static final String ORTHO_COUNT          = "orthologCount";
    public static final String MAP_EXPT_COUNT       = "mappingExptCount";
    public static final String GXD_INDEX_COUNT      = "gxdIndexCount";
    public static final String GXD_RESULT_COUNT     = "gxdResultCount";
    public static final String GXD_STRUCT_COUNT     = "gxdStructureCount";
    public static final String GXD_ASSAY_COUNT      = "gxdAssayCount";

    // Vocabulary
    public static final String VOC_TERM             = "vocTerm";
    public static final String VOC_ID               = "vocID";
    public static final String DAG_TYPE             = "dagType";
    public static final String VOC_VOCAB            = "vocab";
    public static final String VOC_QUALIFIER        = "qualifier";
    public static final String VOC_DAG_NAME         = "dagName";
    public static final String VOC_BY_DAG_STRUCT    = "byDagStruct";
    public static final String VOC_BY_DAG_TERM      = "byDagTerm";
    public static final String BY_MRK_DAG_TERM      = "byMarkerDagTerm";

    // Annotation Constants
    public static final String ANNOTATION_KEY       = "annotationKey";
    public static final String TERM_ID              = "termID";
    public static final String TERM                 = "term";
    public static final String ANNOTATED_TERM_ID    = "annotatedTermID";
    public static final String BY_GENOTYPE_TERM     = "byGenotypeTerm";

    // Genotypes
    public static final String GENOTYPE_KEY	    = "genotypeKey";
    public static final String ALLELE_PAIRS	    = "allelePairs";
    public static final String BACKGROUND_STRAIN    = "backgroundStrain";

    // A special count to denote that no curated data was found
    public static final String NO_CURATED_DATA      = "noDataCurated";

    // Images
    public static final String IMAGE_KEY            = "imageKey";
    public static final String IMAGE_ID             = "imageID";
    public static final String IMAGE_CLASS          = "imageClass";
    public static final String IMAGE_CLASS_PHENO    = "Phenotypes";
    public static final String IMAGE_CLASS_GXD      = "Expression";
    public static final String IS_THUMB             = "isThumb";
    public static final String PANESET_KEY          = "panesetKey";

    // General Sort
    public static final String BY_DEFAULT           = "byDefaultSort";

    // Structure Auto Complete
    public static final String STRUCTUREAC_KEY = "structureKey"; 
    public static final String STRUCTUREAC_STRUCTURE = "structure";
    public static final String STRUCTUREAC_SYNONYM = "synonym";
    public static final String STRUCTUREAC_IS_STRICT_SYNONYM = "isStrictSynonym";
    public static final String STRUCTUREAC_BY_SYNONYM = "by_synonym";
    public static final String STRUCTUREAC_HAS_CRE = "hasCre";
    
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

    // ordering of records (not specific to actual DNA/Poly sequences)
    public static final String SEQUENCE_NUM = "sequenceNum";
}
