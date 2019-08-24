package scrap.heap.refactor.enums;

import org.junit.Test;
import static org.junit.Assert.*;

public class SizeTest {
    @Test public void testSize() {
        Size expectedSize = Size.SMALL;
        Size generatedSize = Size.valueOf("SMALL");
	Size anotherSize = Size.MEDIUM;

        assertEquals("small sizes should match", expectedSize, generatedSize);
        assertEquals("incorrect size", "small", generatedSize.toString());
        assertNotEquals("different sizes shouldn't match", expectedSize, anotherSize);

        try {
            Size badSize = Size.valueOf("TINY");
            fail ("expected exception when calling Size.valueOf() on an invalid size");
        } catch (IllegalArgumentException e) {
            assertTrue("wrong message", e.getMessage().contains("scrap.heap.refactor.enums.Size.TINY"));
        }
    }
}
