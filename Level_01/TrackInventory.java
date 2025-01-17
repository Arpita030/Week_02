class Item {
    String itemName;
    int itemCode;
    double price;


    Item(String itemName, int itemCode, double price) {
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("ItemCode is: " + itemCode);
        System.out.println("ItemName is: " + itemName);
        System.out.println("Price is: " + price);
    }
}

public class TrackInventory {
    public static void main(String[] args) {
        Item I = new Item("Phone", 4835, 45000);
        I.displayDetails();
    }
}
