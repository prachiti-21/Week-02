public class Vehicle {
    // Instance Variables
    private String ownerName;
    private String vehicleType;

    // Class Variable
    private static double registrationFee = 50.0; // Default registration fee

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorbike");

        // Display individual vehicle details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Update the registration fee
        Vehicle.updateRegistrationFee(75.0);
        System.out.println("Registration fee updated.");

        // Display details again to see updated fee
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
