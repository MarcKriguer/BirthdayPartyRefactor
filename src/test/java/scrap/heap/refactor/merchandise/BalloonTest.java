package scrap.heap.refactor.merchandise;

import org.junit.Test;
import static org.junit.Assert.*;
import scrap.heap.refactor.enums.Color;
import scrap.heap.refactor.enums.Material;

public class BalloonTest {
    @Test public void testBalloonMethods() {
        Balloon expectedBalloon = new Balloon(Color.RED, Material.LATEX, 42);
        Balloon anotherBalloon = new Balloon(Color.YELLOW, Material.MYLAR, 1);
        assertNotEquals("different balloons shouldn't match", expectedBalloon, anotherBalloon);

        anotherBalloon.setColor(Color.RED).setMaterial(Material.LATEX).setNumber(42);
        assertEquals("re-set balloons should match", expectedBalloon, anotherBalloon);

        assertEquals("incorrect colors", Color.RED, anotherBalloon.getColor());
        assertEquals("incorrect materials", Material.LATEX, anotherBalloon.getMaterial());
        assertEquals("incorrect numbers", 42, anotherBalloon.getNumber());

        assertEquals("Balloon{color='red', material='latex', number=42}", anotherBalloon.toString());

        try {
            anotherBalloon.setNumber(0);
            fail ("expected exception when calling Balloon.setNumber(0)");
        } catch (IllegalArgumentException e) {
            assertTrue("wrong message", e.getMessage().contains("number (0) must be at least 1"));
        }
    }
}
