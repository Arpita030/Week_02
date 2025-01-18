public class ProductInventory {
    // Instance Variables
    private String productName;
    private double price;

    // Class Variable
    private static int totalProducts = 0;

    // Constructor
    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment the count of total products whenever a new product is created
    }

    // Instance Method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class Method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main Method
    public static void main(String[] args) {
        // Creating product objects
        ProductInventory product1 = new ProductInventory("Laptop", 1200.00);
        ProductInventory product2 = new ProductInventory("Smartphone", 800.00);
        ProductInventory product3 = new ProductInventory("Headphones", 150.00);

        // Displaying individual product details
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();
        product3.displayProductDetails();
        System.out.println();

        // Displaying total products created
        ProductInventory.displayTotalProducts();
    }
}
