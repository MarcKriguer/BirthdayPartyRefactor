package scrap.heap.refactor.merchandise;

import scrap.heap.refactor.enums.Color;
import scrap.heap.refactor.enums.Flavor;
import scrap.heap.refactor.enums.Shape;
import scrap.heap.refactor.enums.Size;

// note: this class holds all the elements of a Cake order
public class Cake {
    private Flavor cakeFlavor;
    private Flavor frostingFlavor;
    private Shape shape;
    private Size size;
    private Color color;

    public Cake(Flavor cakeFlavor, Flavor frostingFlavor, Shape shape, Size size, Color color) {
        setCakeFlavor(cakeFlavor);
        setFrostingFlavor(frostingFlavor);
        setShape(shape);
        setSize(size);
        setColor(color);
    }

    public Flavor getCakeFlavor() {
        return cakeFlavor;
    }

    public Cake setCakeFlavor(Flavor cakeFlavor) {
        this.cakeFlavor = cakeFlavor;
        return this;
    }

    public Flavor getFrostingFlavor() {
        return frostingFlavor;
    }

    public Cake setFrostingFlavor(Flavor frostingFlavor) {
        this.frostingFlavor = frostingFlavor;
        return this;
    }

    public Shape getShape() {
        return shape;
    }

    public Cake setShape(Shape shape) {
        this.shape = shape;
        return this;
    }

    public Size getSize() {
        return size;
    }

    public Cake setSize(Size size) {
        this.size = size;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public Cake setColor(Color color) {
        this.color = color;
        return this;
    }

    @Override
    public String toString() {
        return "Cake{" +
            "cakeFlavor='" + cakeFlavor + '\'' +
            ", frostingFlavor='" + frostingFlavor + '\'' +
            ", shape='" + shape + '\'' +
            ", size='" + size + '\'' +
            ", color='" + color + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cake)) {
            return false;
        }
        final Cake that = (Cake) o;

        if (!cakeFlavor.equals(that.cakeFlavor)) {
            return false;
        }
        if (!frostingFlavor.equals(that.frostingFlavor)) {
            return false;
        }
        if (!shape.equals(that.shape)) {
            return false;
        }
        if (!size.equals(that.size)) {
            return false;
        }
        if (!color.equals(that.color)) {
            return false;
        }
        return true;
    }
}
