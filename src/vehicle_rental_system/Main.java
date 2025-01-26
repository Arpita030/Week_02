package vehicle_rental_system;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("MP04-7689", 4000.0, "CAR7689"));
        vehicles.add(new Bike("MP17-4357", 1050.0, "BIKE4357"));
        vehicles.add(new Truck("MP19-1234", 10000.0, "TRUCK1234"));

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Type: " + vehicle.getType());
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println();
        }
    }
}
