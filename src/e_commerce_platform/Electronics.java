package e_commerce_platform;

public class Electronics extends Product implements Taxable{

    private static final double DISCOUNT_PERCENTAGE = 8;
    private static final double TAX_RATE = 15;

    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }


    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_PERCENTAGE / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE / 100;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Electronics Tax Rate: " + TAX_RATE + "%");
    }
}
