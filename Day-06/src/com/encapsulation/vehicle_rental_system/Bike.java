package com.encapsulation.vehicle_rental_system;

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

