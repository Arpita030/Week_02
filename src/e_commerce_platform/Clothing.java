package e_commerce_platform;

public class Clothing extends Product implements Taxable{

    private static final double discountPercentage = 6;
    private static final double taxRate = 15;

    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountPercentage / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate / 100;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Clothing Tax Rate: " + taxRate + "%");
    }
}
