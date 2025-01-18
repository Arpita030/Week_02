public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Default Constructor
    public CarRental() {
        this.customerName = "Default Customer";
        this.carModel = "Default Car";
        this.rentalDays = 1;
        this.dailyRate = 50.0; // Default daily rate
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Copy Constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.dailyRate = other.dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
        System.out.println("---------------------------");
    }

    // Main Method
    public static void main(String[] args) {
        // Default constructor example
        CarRental rental1 = new CarRental();
        rental1.displayDetails();

        // Parameterized constructor example
        CarRental rental2 = new CarRental("Arpita Goutam", "Toyota Corolla", 5, 70.0);
        rental2.displayDetails();

        // Copy constructor example
        CarRental rental3 = new CarRental(rental2);
        rental3.displayDetails();
    }
}
