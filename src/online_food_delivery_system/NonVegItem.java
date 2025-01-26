package online_food_delivery_system;

class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private static final double NON_VEG_CHARGE = 5.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + NON_VEG_CHARGE * getQuantity()) - discount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = ((getPrice() * getQuantity() + NON_VEG_CHARGE * getQuantity()) * (percentage / 100));
        System.out.println("Discount of " + percentage + "% applied to Non-Veg Item.");
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount;
    }
}
