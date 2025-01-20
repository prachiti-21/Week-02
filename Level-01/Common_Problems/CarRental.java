public class CarRental {

        // Attributes of the CarRental class
        private String customerName;
        private String carModel;
        private int rentalDays;
        private double dailyRate;

        // Constructor to initialize rental details
        public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
            this.dailyRate = dailyRate;
        }

        // Method to calculate the total cost
        public double calculateTotalCost() {
            return rentalDays * dailyRate;
        }

        // Getters
        public String getCustomerName() {
            return customerName;
        }

        public String getCarModel() {
            return carModel;
        }

        public int getRentalDays() {
            return rentalDays;
        }

        public double getDailyRate() {
            return dailyRate;
        }

        // Main method for testing
        public static void main(String[] args) {
            // Creating a CarRental object
            CarRental rental1 = new CarRental("John Doe", "Toyota Camry", 5, 50.0);

            // Display rental details
            System.out.println("Customer Name: " + rental1.getCustomerName());
            System.out.println("Car Model: " + rental1.getCarModel());
            System.out.println("Rental Days: " + rental1.getRentalDays());
            System.out.println("Daily Rate: $" + rental1.getDailyRate());

            // Calculate and display total cost
            System.out.println("Total Cost: $" + rental1.calculateTotalCost());
        }
    }


