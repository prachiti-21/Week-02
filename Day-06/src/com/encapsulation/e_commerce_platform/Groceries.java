package com.encapsulation.e_commerce_platform;
class Groceries extends Product implements Taxable {
    private double weight;
    private double pricePerWeight;
    private double taxPercent;
    private double taxedPrice;
    private double discountPercent;
    private double discountedPrice;
    private double totalPrice;

    public Groceries(int productId, String name, double taxPercent, double discountPercent, double weight, double pricePerWeight) {
        super(productId, name, weight * pricePerWeight); // Calculate price based on weight
        this.taxPercent = taxPercent;
        this.discountPercent = discountPercent;
        this.weight = weight;
        this.pricePerWeight = pricePerWeight;
        this.totalPrice = weight * pricePerWeight;
    }

    @Override
    public void calculateDiscount() {
        discountedPrice = totalPrice - (discountPercent / 100) * totalPrice;
    }

    @Override
    public void calculateTax() {
        taxedPrice = discountedPrice + (discountedPrice * taxPercent / 100);
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Taxed Price: " + taxedPrice);
    }

    public void displayDetails() {
        System.out.println("Product Name: " + getName());
        System.out.println("Product ID: " + getProductId());
        System.out.println("Weight: " + weight);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discounted Price: " + discountedPrice);
    }
}

