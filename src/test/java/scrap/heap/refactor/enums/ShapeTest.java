package scrap.heap.refactor.enums;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShapeTest {
    @Test public void testShape() {
        Shape expectedShape = Shape.SQUARE;
        Shape generatedShape = Shape.valueOf("SQUARE");
	Shape anotherShape = Shape.CIRCLE;

        assertEquals("square shapes should match", expectedShape, generatedShape);
        assertEquals("incorrect shape", "square", generatedShape.toString());
        assertNotEquals("different shapes shouldn't match", expectedShape, anotherShape);

        try {
            Shape badShape = Shape.valueOf("OCTAGON");
            fail ("expected exception when calling Shape.valueOf() on an invalid shape");
        } catch (IllegalArgumentException e) {
            assertTrue("wrong message", e.getMessage().contains("scrap.heap.refactor.enums.Shape.OCTAGON"));
        }
    }
}
