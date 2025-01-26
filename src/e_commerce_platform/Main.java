package e_commerce_platform;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics("P101", "Laptop", 50000));
        products.add(new Clothing("P102", "T-Shirt", 1500));
        products.add(new Groceries("P103", "Rice", 300));

        for (Product product : products) {
            System.out.println("Product Name: " + product.getName());
            System.out.println("Original Price: " + product.getPrice());
            if (product instanceof Taxable) {
                ((Taxable) product).getTaxDetails();
            } else {
                System.out.println("No tax details for this product.");
            }
            double finalPrice = product.calculateFinalPrice();
            System.out.println("Final Price (Price + Tax - Discount): " + finalPrice);
            System.out.println();
        }
    }
}
