package com.encapsulation.e_commerce_platform;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract void calculateDiscount();
}

/*interface Taxable {
    void calculateTax();
    void getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double taxPercent;
    private double taxedPrice;
    private double discountPercent;
    private double discountedPrice;

    public Electronics(int productId, String name, double price, double taxPercent, double discountPercent) {
        super(productId, name, price);
        this.taxPercent = taxPercent;
        this.discountPercent = discountPercent;
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
        System.out.println("Discounted Price: " + discountedPrice);
    }
}

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

class ECommercePlatform {
    public static void main(String[] args) {
        Electronics electronics = new Electronics(1, "Laptop", 70000, 10, 20);
        electronics.calculateDiscount();
        electronics.calculateTax();
        electronics.displayDetails();
        electronics.getTaxDetails();

        Clothing clothing = new Clothing(2, "Shirt", 500, 5, 10, "Cotton");
        clothing.calculateDiscount();
        clothing.calculateTax();
        clothing.displayDetails();
        clothing.getTaxDetails();

        Groceries groceries = new Groceries(3, "Flour", 10, 5, 2, 50);
        groceries.calculateDiscount();
        groceries.calculateTax();
        groceries.displayDetails();
        groceries.getTaxDetails();
    }
}*/
