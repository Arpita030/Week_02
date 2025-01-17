class CartItem {
     String itemName;
     int quantity;

    CartItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }
    void addToCart(int quantity) {
        this.quantity += quantity;
    }
    void removeFromCart(int quantity) {
        if(this.quantity >= quantity) {
            this.quantity -= quantity;
        }
        else {
            System.out.println("Insufficient Quantity");
        }
    }
    void display() {
        System.out.println("Item Name: "+itemName);
        System.out.println("Quantity: "+quantity);
    }

}
public class ShoppingCart {
    public static void main(String[] args) {
        CartItem c1 = new CartItem("Laptop", 1);
        c1.display();
        c1.addToCart(2);
        c1.display();
        c1.removeFromCart(1);
        c1.display();
        c1.removeFromCart(5);
        c1.display();
    }
}