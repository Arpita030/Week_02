import java.util.ArrayList;
import java.util.List;

class Product {
    private int productId;
    private String productName;
    private double price;

    // Constructor
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // Method to get product details
    public String getProductDetails() {
        return "Product ID: " + productId + ", Name: " + productName + ", Price: $" + price;
    }

    public String toString() {
        return productName + " ($" + price + ")";
    }
}

class Customer {
    private int customerId;
    private String customerName;
    private List<Product> products;

    // Constructor
    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.products = new ArrayList<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        products.add(product);
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Product> getProducts() {
        return products;
    }

    // Method to get customer details
    public String getCustomerDetails() {
        return "Customer ID: " + customerId + ", Name: " + customerName;
    }

    public String toString() {
        return customerName + " (ID: " + customerId + ")";
    }
}

class BillGenerator {
    // Method to calculate total bill
    public double calculateTotal(Customer customer) {
        double total = 0.0;
        for (Product product : customer.getProducts()) {
            total += product.getPrice();
        }
        return total;
    }

    // Method to generate bill details
    public String generateBill(Customer customer) {
        StringBuilder billDetails = new StringBuilder();
        billDetails.append("Customer: ").append(customer.getCustomerDetails()).append("\n");
        billDetails.append("Purchased Products:\n");

        for (Product product : customer.getProducts()) {
            billDetails.append("  - ").append(product.getProductDetails()).append("\n");
        }

        double total = calculateTotal(customer);
        billDetails.append("Total Bill: $").append(String.format("%.2f", total));
        return billDetails.toString();
    }
}

public class GroceryStoreMain {
    public static void main(String[] args) {
        // Create Products
        Product apples = new Product(1, "Apples (2 kg)", 6.0); // 2 kg at $3 per kg
        Product milk = new Product(2, "Milk (1 liter)", 2.0); // 1 liter at $2 per liter

        // Create Customer
        Customer customer = new Customer(101, "Alice");
        customer.addProduct(apples);
        customer.addProduct(milk);

        // Generate Bill
        BillGenerator billGenerator = new BillGenerator();
        System.out.println(billGenerator.generateBill(customer));
    }
}