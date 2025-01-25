package HybridInheritance;

class Vehicle {
    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging the electric vehicle");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelTankCapacity;

    public PetrolVehicle(String model, int maxSpeed, double fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla ", 350, 55);
        System.out.println("Electric Vehicle Details:");
        ev.displayDetails();
        ev.charge();
        System.out.println();

        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 400, 50);
        System.out.println("Petrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel();
    }
}