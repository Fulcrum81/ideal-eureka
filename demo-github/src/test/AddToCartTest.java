package test;

public class AddToCartTest extends TestBase {

    public void add7GoodsToCart() {
        startApplication();
        System.out.println("Find goods in catalog");
        System.out.println("Click add to cart 7 times");
        System.out.println("Validate that the cart contains 7 goods of required type");
    }

    public void priceInCartCalculation() {
        startApplication();
        System.out.println("Find different goods in catalog");
        System.out.println("Click add to cart for all the selected goods");
        System.out.println("Validate that the price is calculated correctly");
    }
}
