package scrap.heap.refactor.merchandise;

import org.junit.Test;
import static org.junit.Assert.*;
import scrap.heap.refactor.enums.Color;
import scrap.heap.refactor.enums.Flavor;
import scrap.heap.refactor.enums.Shape;
import scrap.heap.refactor.enums.Size;

public class CakeTest {
    @Test public void testCakeMethods() {
        Cake expectedCake = new Cake(Flavor.CHOCOLATE, Flavor.CHOCOLATE, Shape.SQUARE, Size.LARGE, Color.YELLOW);
        Cake anotherCake = new Cake(Flavor.VANILLA, Flavor.VANILLA, Shape.CIRCLE, Size.SMALL, Color.RED);
        assertNotEquals("different cakes shouldn't match", expectedCake, anotherCake);

        anotherCake.setCakeFlavor(Flavor.CHOCOLATE).setFrostingFlavor(Flavor.CHOCOLATE).setShape(Shape.SQUARE);
        anotherCake.setSize(Size.LARGE).setColor(Color.YELLOW);
        assertEquals("re-set cakes should match", expectedCake, anotherCake);

        assertEquals("incorrect cake flavor", Flavor.CHOCOLATE, anotherCake.getCakeFlavor());
        assertEquals("incorrect frosting flavor", Flavor.CHOCOLATE, anotherCake.getFrostingFlavor());
        assertEquals("incorrect shapes", Shape.SQUARE, anotherCake.getShape());
        assertEquals("incorrect sizes", Size.LARGE, anotherCake.getSize());
        assertEquals("incorrect colors", Color.YELLOW, anotherCake.getColor());

        String expectedString = "Cake{cakeFlavor='chocolate', frostingFlavor='chocolate', shape='square', size='large', color='yellow'}";
        assertEquals(expectedString, anotherCake.toString());
    }
}
