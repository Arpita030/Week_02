package online_food_delivery_system;

public class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = (getPrice() * getQuantity()) * (percentage / 100);
        System.out.println("Discount of " + percentage + "% applied to Veg Item.");
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount;
    }
}
