package scrap.heap.refactor.enums;

// the material that a particular balloon is made of
public enum Material {
    LATEX ("latex"),
    MYLAR ("mylar");

    private final String material;

    Material(final String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material;
    }
}
