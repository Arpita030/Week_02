class Product {
    private static double discount = 10;
    private String productName;
    private double price;
    private int quantity;
    private final int productId;

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public Product(int quantity, String productName, double price, int productId) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }

    public double calculateTotalPrice() {
        double totalprice = price * quantity;
        return totalprice - (totalprice * discount / 100);
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("The productId of product is " + productId);
            System.out.println("The name of product is " + productName);
            System.out.println("The price of product is " + price);
            System.out.println("The quantity of product is " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price after Discount: $" + calculateTotalPrice());
        } else {
            System.out.println("please enter valid products");
        }

    }

    public static void main(String[] args) {
        Product p1 = new Product(01, "Laptop", 1000.0, 2);
        Product p2 = new Product(02, "Smartphone", 800.0, 1);

        Product.updateDiscount(25.0);
        p1.displayDetails();
        p2.displayDetails();
    }

}