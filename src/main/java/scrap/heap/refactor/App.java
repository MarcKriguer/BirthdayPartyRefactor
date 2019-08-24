package scrap.heap.refactor;

import scrap.heap.refactor.enums.Color;
import scrap.heap.refactor.enums.Flavor;
import scrap.heap.refactor.enums.Material;
import scrap.heap.refactor.enums.Shape;
import scrap.heap.refactor.enums.Size;
import scrap.heap.refactor.merchandise.Balloon;
import scrap.heap.refactor.merchandise.Cake;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        // first order - balloons and cake
        Balloon balloon1 = new Balloon(Color.RED, Material.MYLAR, 4);
        Cake cake1 = new Cake(Flavor.CHOCOLATE, Flavor.CHOCOLATE, Shape.CIRCLE, Size.LARGE, Color.BROWN);
        order(balloon1, cake1);

        // second order - balloons and cake
        Balloon balloon2 = new Balloon(Color.BLUE, Material.LATEX, 7);
        Cake cake2 = new Cake(Flavor.VANILLA, Flavor.CHOCOLATE, Shape.SQUARE, Size.MEDIUM, Color.BROWN);
        order(balloon2, cake2);

        // third order - just balloons
        Balloon balloon3 = new Balloon(Color.YELLOW, Material.MYLAR, 4);
        order(balloon3, null);

        // fourth order - just cake
        Cake cake3 = new Cake(Flavor.VANILLA, Flavor.VANILLA, Shape.SQUARE, Size.SMALL, Color.YELLOW);
        order(null, cake3);
    }

    public static void order(Balloon balloon, Cake cake) {
        if (balloon == null && cake == null) {
            throw new IllegalArgumentException("at least one of (balloon, cake) must be specified");
        }
        if (balloon != null) {
            orderBalloons(balloon);
        }
        if (cake != null) {
            orderCake(cake);
        }
    }

    private static void orderBalloons(Balloon balloon) {
        //for the purposes of this exercise, pretend this method works and adds balloons to the order
        System.out.println("Balloons ordered; " + balloon);
    }

    private static void orderCake(Cake cake) {

        //for the purposes of this exercise, pretend that this method adds a cake to the order
        System.out.println("cake ordered; " + cake);
    }
}
