package com.encapsulation.ride_hailing_application;

// Abstract class Vehicle
abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver Name: " + driverName + ", Rate Per Km: " + ratePerKm;
    }

    public abstract double calculateFare(double distance);
}

// Interface GPS
/*interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

// Subclass Car
class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

// Subclass Bike
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

// Subclass Auto
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

// Main class to demonstrate functionality
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
}*/
