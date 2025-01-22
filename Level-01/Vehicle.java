public class Vehicle {


        // Static variable shared across all vehicles
        private static double registrationFee = 500.00;

        // Instance variables
        private final String registrationNumber; // Final variable for unique identification
        private String ownerName;
        private String vehicleType;

        // Constructor
        public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
            this.registrationNumber = registrationNumber;
        }

        // Static method to update the registration fee
        public static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
            System.out.println("Registration fee updated to: $" + registrationFee);
        }

        // Static method to get the current registration fee
        public static double getRegistrationFee() {
            return registrationFee;
        }

        // Method to display vehicle details
        public void displayDetails() {
            if (this instanceof Vehicle) { // Check if the object is an instance of Vehicle
                System.out.println("Owner Name: " + ownerName);
                System.out.println("Vehicle Type: " + vehicleType);
                System.out.println("Registration Number: " + registrationNumber);
                System.out.println("Registration Fee: $" + registrationFee);
            } else {
                System.out.println("The object is not an instance of Vehicle.");
            }
        }

        // Main method for demonstration
        public static void main(String[] args) {
            // Creating vehicle objects
            Vehicle vehicle1 = new Vehicle("Alice", "Car", "CAR123");
            Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle", "BIKE456");

            // Displaying initial details
            vehicle1.displayDetails();
            vehicle2.displayDetails();

            // Updating registration fee
            Vehicle.updateRegistrationFee(600.00);

            // Displaying updated details
            vehicle1.displayDetails();
            vehicle2.displayDetails();
        }
    }


