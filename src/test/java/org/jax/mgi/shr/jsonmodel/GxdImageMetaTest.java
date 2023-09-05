package org.jax.mgi.shr.jsonmodel;


import org.junit.Assert;
import org.junit.Test;

public class GxdImageMetaTest {

	@Test
	public void testAddDuplicateSpecimenLabels() {
		GxdImageMeta meta = new GxdImageMeta();
		meta.addSpecimenLabel("label1", "assay1");
		meta.addSpecimenLabel("label1", "assay1");
		meta.addSpecimenLabel("label1", "assay1");
		meta.addSpecimenLabel("label1", "assay1");
		meta.addSpecimenLabel("label1", "assay1");
		
		Assert.assertEquals(1, meta.getSpecimenLabels().size());
	}

}
