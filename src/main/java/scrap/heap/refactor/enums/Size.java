package scrap.heap.refactor.enums;

// the size of a particular cake
public enum Size {
    SMALL ("small"),
    MEDIUM ("med"),
    LARGE ("large");

    private final String size;

    Size(final String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size;
    }
}
