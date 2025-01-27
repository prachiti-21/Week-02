package com.encapsulation.ride_hailing_application;

public class RideHailingApplication {
    public static void processRide(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Fare for distance " + distance + " km: " + vehicle.calculateFare(distance));

        if (vehicle instanceof GPS) {
            GPS gps = (GPS) vehicle;
            gps.updateLocation("New Destination");
            System.out.println("Updated Location: " + gps.getCurrentLocation());
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Car(1, "Alice", 10.0);
        Vehicle bike = new Bike(2, "Bob", 5.0);
        Vehicle auto = new Auto(3, "Charlie", 8.0);

        System.out.println("Processing Car Ride:");
        processRide(car, 15);

        System.out.println("\nProcessing Bike Ride:");
        processRide(bike, 20);

        System.out.println("\nProcessing Auto Ride:");
        processRide(auto, 10);
    }
}

