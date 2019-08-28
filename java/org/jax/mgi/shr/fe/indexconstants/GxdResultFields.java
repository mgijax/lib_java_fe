package org.jax.mgi.shr.fe.indexconstants;

public class GxdResultFields
{
	 // GXD Result Index
    // assay result centric query fields
    public static final String KEY = "uniqueKey";
    public static final String RESULT_KEY = "resultKey";
    public static final String RESULT_TYPE = "resultType";
    public static final String ASSAY_TYPE = "assayType";
    public static final String THEILER_STAGE = "theilerStage";
    public static final String IS_EXPRESSED = "isExpressed";
    public static final String AGE_MIN = "ageMin";
    public static final String AGE_MAX = "ageMax";
    public static final String STRUCTURE_ANCESTORS = "structureAncestors";
    public static final String STRUCTURE_EXACT = "structureExact";
    public static final String EMAPS_ID = "emapsId";
    public static final String STRUCTURE_ID = "structureId";
    public static final String STRUCTURE_KEY = "structureKey";
    public static final String ANNOTATED_STRUCTURE_KEY = "annotatedStructureKey";
    public static final String STRUCTURE_DESCENDANTS = "structureDescendants";
    public static final String MUTATED_IN = "mutatedIn";
    public static final String IS_WILD_TYPE = "isWildType";
    public static final String ALLELE_ID = "alleleId";

    //result centric summary fields
    public static final String ASSAY_MGIID = "assayMgiid";
    public static final String ANATOMICAL_SYSTEM = "anatomicalSystem";
    public static final String AGE = "age";
    public static final String STRUCTURE_PRINTNAME = "printname";
    public static final String DETECTION_LEVEL = "detectionLevel";
    public static final String FIGURE = "figure";
    public static final String FIGURE_PLAIN = "figurePlain";
    public static final String GENOTYPE = "genotype";
    public static final String JNUM = "jNum";
    public static final String PUBMED_ID = "pubmedId";
    public static final String SHORT_CITATION = "shortCitation";
    public static final String PATTERN = "pattern";

    // Result sorts are prepended by 'R'
    // Assay sorts are prepended by 'A'
    // Marker sorts are propended by 'M'
    public static final String R_BY_ASSAY_TYPE = "byResultAssayType";
    public static final String R_BY_MRK_SYMBOL = "byResultMrkSymbol";
    public static final String R_BY_ANATOMICAL_SYSTEM = "byResultAnatomicalSystem";
    public static final String R_BY_AGE = "byResultAge";
    public static final String R_BY_STRUCTURE = "byResultStructure";
    public static final String R_BY_EXPRESSED = "byResultExpressed";
    public static final String R_BY_MUTANT_ALLELES = "byResultMutantAlleles";
    public static final String R_BY_REFERENCE = "byResultReference";
    public static final String M_BY_MRK_SYMBOL= "byMrkSymbol";
    public static final String M_BY_LOCATION= "byLocation";

    // assay centric fields
    public static final String ASSAY_KEY = "assayKey";
    public static final String ASSAY_HAS_IMAGE = "hasImage";

    // assay centric sorts
    public static final String A_BY_SYMBOL = "byAssayMrkSymbol";
    public static final String A_BY_ASSAY_TYPE = "byAssayAssayType";

    // marker centric query fields
    public static final String MARKER_KEY = "markerKey";
    public static final String NOMENCLATURE = "nomenclature";
    public static final String ANNOTATION = "annotation";

    //marker centric summary fields
    public static final String MARKER_MGIID = "markerMgiid";
    public static final String MARKER_SYMBOL = "markerSymbol";
    public static final String MARKER_NAME = "markerName";
    public static final String MARKER_TYPE = "markerType";
    public static final String CHROMOSOME = "chr";
    public static final String CENTIMORGAN = "cM";
    public static final String CYTOBAND = "cytoband";
    public static final String START_COORD = "startCoord";
    public static final String END_COORD = "endCoord";
    public static final String STRAND = "strand";
    public static final String MOUSE_COORDINATE = "mc";

    // marker-centric filtering fields
    public static final String MP_HEADERS = "mpHeaders";
    public static final String GO_HEADERS = "goHeaders";
    public static final String DO_HEADERS = "doHeaders";
    public static final String FEATURE_TYPES = "featureTypes";
    public static final String AGES = "ages";
    
    // other query fields
    public static final String PROBE_KEY = "probeKey";
    public static final String ANTIBODY_KEY = "antibodyKey";

    // differential fields
    public static final String DIFF_POS_ANCESTORS = "posAnc";
    public static final String DIFF_EXC_ANCESTORS = "excAnc";
    public static final String DIFF_EXC_ANCESTORS_ALL_STAGES = "excAncAllStages";
    public static final String DIFF_NEG_DESCENDANTS = "negDec";
    public static final String DIFF_EXCLUSIVE_STRUCTURES = "exclusiveStructures";
    public static final String DIFF_EXCLUSIVE_STAGES = "exclusiveStages";

    // Matrix group fields
    public static final String STAGE_MATRIX_GROUP = "stageMatrixGroup";
    public static final String GENE_MATRIX_GROUP = "geneMatrixGroup";
}
