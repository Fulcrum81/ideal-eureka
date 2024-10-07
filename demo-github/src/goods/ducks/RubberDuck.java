package goods.ducks;

import goods.GoodsItem;

public class RubberDuck extends GoodsItem {

    private String color;
    private String size;
    Eyes eyes;

    public RubberDuck(String color, String size, double price) {
        this.color = color;
        this.size = size;
        this.price = price + price * 0.15;
    }

    public RubberDuck(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    void printInfo() {
        System.out.printf("Duck color: %s\nDuck size: %s\nDuck price: %f\n", color, size, price);
    }

    void addToCart(int quantity) {
        System.out.printf("Added %d %s ducks to cart\n", quantity, color);
    }

    static void somethingStatic() {
    }
}