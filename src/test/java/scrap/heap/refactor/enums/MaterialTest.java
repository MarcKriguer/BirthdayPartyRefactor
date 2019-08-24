package scrap.heap.refactor.enums;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaterialTest {
    @Test public void testMaterial() {
        Material expectedMaterial = Material.LATEX;
        Material generatedMaterial = Material.valueOf("LATEX");
	Material anotherMaterial = Material.MYLAR;

        assertEquals("latex materials should match", expectedMaterial, generatedMaterial);
        assertEquals("incorrect material", "latex", generatedMaterial.toString());
        assertNotEquals("different materials shouldn't match", expectedMaterial, anotherMaterial);

        try {
            Material badMaterial = Material.valueOf("PAPER");
            fail ("expected exception when calling Material.valueOf() on an invalid material");
        } catch (IllegalArgumentException e) {
            assertTrue("wrong message", e.getMessage().contains("scrap.heap.refactor.enums.Material.PAPER"));
        }
    }
}
