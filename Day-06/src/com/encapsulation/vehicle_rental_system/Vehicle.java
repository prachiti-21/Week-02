package com.encapsulation.vehicle_rental_system;

    abstract class Vehicle {
        private String vehicleNumber;
        private String type;
        private double rentalRate;

        public Vehicle(String vehicleNumber, String type, double rentalRate) {
            this.vehicleNumber = vehicleNumber;
            this.type = type;
            this.rentalRate = rentalRate;
        }

        public String getVehicleNumber() {
            return vehicleNumber;
        }

        public String getType() {
            return type;
        }

        public double getRentalRate() {
            return rentalRate;
        }

        public void setRentalRate(double rentalRate) {
            this.rentalRate = rentalRate;
        }

        // Abstract method to calculate rental cost
        public abstract double calculateRentalCost(int days);
    }

    // Interface for insurance functionality
    /*interface Insurable {
        double calculateInsurance();
        void getInsuranceDetails();
    }

    // Subclass Car
    class Car extends Vehicle implements Insurable {
        private double insuranceRate;

        public Car(String vehicleNumber, double rentalRate, double insuranceRate) {
            super(vehicleNumber, "Car", rentalRate);
            this.insuranceRate = insuranceRate;
        }

        @Override
        public double calculateRentalCost(int days) {
            return getRentalRate() * days;
        }

        @Override
        public double calculateInsurance() {
            return insuranceRate * getRentalRate();
        }

        @Override
        public void getInsuranceDetails() {
            System.out.println("Car Insurance Cost: " + calculateInsurance());
        }
    }

    // Subclass Bike

    // Subclass Truck
    class Bike extends Vehicle implements Insurable {
        private double insuranceRate;

        public Bike(String vehicleNumber, double rentalRate, double insuranceRate) {
            super(vehicleNumber, "Bike", rentalRate);
            this.insuranceRate = insuranceRate;
        }

        @Override
        public double calculateRentalCost(int days) {
            return getRentalRate() * days;
        }

        @Override
        public double calculateInsurance() {
            return insuranceRate * getRentalRate();
        }

        @Override
        public void getInsuranceDetails() {
            System.out.println("Bike Insurance Cost: " + calculateInsurance());
        }
    }
class Truck extends Vehicle implements Insurable {
        private double insuranceRate;

        public Truck(String vehicleNumber, double rentalRate, double insuranceRate) {
            super(vehicleNumber, "Truck", rentalRate);
            this.insuranceRate = insuranceRate;
        }

        @Override
        public double calculateRentalCost(int days) {
            return getRentalRate() * days + (days > 3 ? 500 : 0); // Extra charge for rentals over 3 days
        }

        @Override
        public double calculateInsurance() {
            return insuranceRate * getRentalRate();
        }

        @Override
        public void getInsuranceDetails() {
            System.out.println("Truck Insurance Cost: " + calculateInsurance());
        }
    }

    // Main class
    public class VehicleRentalSystem {
        public static void main(String[] args) {
            // Create instances of vehicles
            Car car = new Car("CAR123", 1000, 0.05);
            Bike bike = new Bike("BIKE123", 500, 0.02);
            Truck truck = new Truck("TRUCK123", 3000, 0.1);

            // Calculate and display rental costs and insurance
            System.out.println("Car Rental Cost for 5 days: " + car.calculateRentalCost(5));
            car.getInsuranceDetails();

            System.out.println("\nBike Rental Cost for 3 days: " + bike.calculateRentalCost(3));
            bike.getInsuranceDetails();

            System.out.println("\nTruck Rental Cost for 7 days: " + truck.calculateRentalCost(7));
            truck.getInsuranceDetails();
        }
    }*/


