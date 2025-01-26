package ride_hailing_application;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void calculateFares(List<Vehicle> vehicles, double distance) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));

            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("New Location");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C001", "Manu", 100.0, "Downtown"));
        vehicles.add(new Bike("B001", "Raju", 150.0, "Uptown"));
        vehicles.add(new Auto("A001", "Alka", 270.0, "Suburb"));

        calculateFares(vehicles, 15.0);
    }
}
