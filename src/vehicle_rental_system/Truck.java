package vehicle_rental_system;

class Truck extends Vehicle implements Insurable{
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 100.0;
    }

    @Override
    public double calculateInsurance() {
        return 10000.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}
