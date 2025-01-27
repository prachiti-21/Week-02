package com.encapsulation.vehicle_rental_system;

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
}
