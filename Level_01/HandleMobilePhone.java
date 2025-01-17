class MobilePhone {
    String brand;
    String Model;
    double price;

    MobilePhone(String brand, String Model, double price) {
        this.brand = brand;
        this.Model = Model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("brand is: " + brand);
        System.out.println("Model is: " + Model);
        System.out.println("Price is: " + price);
    }
}

public class HandleMobilePhone {
    public static void main(String[] args) {
        MobilePhone mobile = new MobilePhone("APPLE", "15", 100000);
        mobile.displayDetails();
    }
}
