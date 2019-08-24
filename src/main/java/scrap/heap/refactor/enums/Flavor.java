package scrap.heap.refactor.enums;

// note: this is currently shared between cake flavors and frosting flavors.
/* TODO(myk): determine if: (a) this will suffice, (b) additional fields should
   be added to determine which flavors are suitable for each, or (c) just add
   distinct enums for cake flavors versus frosting flavors. */
public enum Flavor {
    CHOCOLATE ("chocolate"),
    VANILLA ("vanilla");

    private final String flavor;

    Flavor(final String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return flavor;
    }
}
