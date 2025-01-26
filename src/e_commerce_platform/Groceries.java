package e_commerce_platform;

public class Groceries extends Product {
    private static final double DISCOUNT_PERCENTAGE = 0;
    private static final double TAX_RATE = 5;

    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_PERCENTAGE / 100;
    }

}
