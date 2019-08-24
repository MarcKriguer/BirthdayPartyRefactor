package scrap.heap.refactor.enums;

// note: this is currently shared between cake colors and balloon colors.
/* TODO(myk): determine if: (a) this will suffice, (b) additional fields should
   be added to determine which colors are suitable for each, or (c) just add
   distinct enums for cake colors versus balloon colors. */
public enum Color {
    BLUE ("blue"),
    BROWN ("brown"),
    RED ("red"),
    YELLOW ("yellow");

    private final String color;

    Color(final String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
