package scrap.heap.refactor.enums;

import org.junit.Test;
import static org.junit.Assert.*;

public class FlavorTest {
    @Test public void testFlavor() {
        Flavor expectedFlavor = Flavor.CHOCOLATE;
        Flavor generatedFlavor = Flavor.valueOf("CHOCOLATE");
        Flavor anotherFlavor = Flavor.valueOf("VANILLA");

        assertEquals("chocolate flavors should match", expectedFlavor, generatedFlavor);
        assertEquals("incorrect flavor", "chocolate", generatedFlavor.toString());
        assertNotEquals("different flavors shouldn't match", expectedFlavor, anotherFlavor);

        try {
            Flavor badFlavor = Flavor.valueOf("STRAWBERRY");
            fail ("expected exception when calling Flavor.valueOf() on an invalid flavor");
        } catch (IllegalArgumentException e) {
            assertTrue("wrong message", e.getMessage().contains("scrap.heap.refactor.enums.Flavor.STRAWBERRY"));
        }
    }
}
