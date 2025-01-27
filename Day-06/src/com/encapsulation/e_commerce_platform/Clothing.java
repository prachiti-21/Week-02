package com.encapsulation.e_commerce_platform;

class Clothing extends Product implements Taxable {
    private String fabric;
    private double taxPercent;
    private double taxedPrice;
    private double discountPercent;
    private double discountedPrice;

    public Clothing(int productId, String name, double price, double taxPercent, double discountPercent, String fabric) {
        super(productId, name, price);
        this.taxPercent = taxPercent;
        this.discountPercent = discountPercent;
        this.fabric = fabric;
    }

    @Override
    public void calculateDiscount() {
        discountedPrice = getPrice() - (discountPercent / 100) * getPrice();
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
        System.out.println("Original Price: " + getPrice());
        System.out.println("Fabric: " + fabric);
        System.out.println("Discounted Price: " + discountedPrice);
    }
}

