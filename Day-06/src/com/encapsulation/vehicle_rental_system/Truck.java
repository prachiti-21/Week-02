package com.encapsulation.vehicle_rental_system;

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

