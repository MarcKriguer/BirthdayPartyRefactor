package scrap.heap.refactor.enums;

import org.junit.Test;
import static org.junit.Assert.*;

public class ColorTest {
    @Test public void testColor() {
        Color expectedColor = Color.BLUE;
        Color generatedColor = Color.valueOf("BLUE");
	Color anotherColor = Color.YELLOW;

        assertEquals("blue colors should match", expectedColor, generatedColor);
        assertEquals("incorrect color", "blue", generatedColor.toString());
        assertNotEquals("different colors shouldn't match", expectedColor, anotherColor);

        try {
            Color badColor = Color.valueOf("PURPLE");
            fail ("expected exception when calling Color.valueOf() on an invalid color");
        } catch (IllegalArgumentException e) {
            assertTrue("wrong message", e.getMessage().contains("scrap.heap.refactor.enums.Color.PURPLE"));
        }
    }
}
