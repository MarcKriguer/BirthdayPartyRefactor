package scrap.heap.refactor.merchandise;

import scrap.heap.refactor.enums.Color;
import scrap.heap.refactor.enums.Material;

// note: this class holds all the elements of a Balloon order
public class Balloon {
    private Color color;
    private Material material;
    private int number;

    public Balloon(Color color, Material material, int number) {
        setColor(color);
        setMaterial(material);
        setNumber(number);
    }

    public Color getColor() {
        return color;
    }

    public Balloon setColor(Color color) {
        this.color = color;
        return this;
    }

    public Material getMaterial() {
        return material;
    }

    public Balloon setMaterial(Material material) {
        this.material = material;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Balloon setNumber(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("number (" + number + ") must be at least 1");
        }
        this.number = number;
        return this;
    }

    @Override
    public String toString() {
        return "Balloon{" +
            "color='" + color + '\'' +
            ", material='" + material + '\'' +
            ", number=" + number +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Balloon)) {
            return false;
        }
        final Balloon that = (Balloon) o;

        if (!color.equals(that.color)) {
            return false;
        }
        if (!material.equals(that.material)) {
            return false;
        }
        if (number != that.number) {
            return false;
        }
        return true;
    }
}
