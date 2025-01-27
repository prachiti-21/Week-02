package com.encapsulation.vehicle_rental_system;

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
