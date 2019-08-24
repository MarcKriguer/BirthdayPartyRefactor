package scrap.heap.refactor.enums;

// the shape of a particular cake
public enum Shape {
    CIRCLE ("circle"),
    SQUARE ("square");

    private final String shape;

    Shape(final String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return shape;
    }
}
