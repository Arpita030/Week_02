import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", products=" + products +
                '}';
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void displayOrders() {
        System.out.println("Customer: " + name + "'s Orders:");
        for (Order order : orders) {
            System.out.println(order);
            System.out.println("Total: $" + order.calculateTotal());
        }
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Headphones", 150.00);
        Product product3 = new Product("Mouse", 25.00);

        Customer customer = new Customer("John Doe");

        Order order1 = new Order(1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(2);
        order2.addProduct(product3);

        customer.placeOrder(order1);
        customer.placeOrder(order2);

        customer.displayOrders();
    }
}
