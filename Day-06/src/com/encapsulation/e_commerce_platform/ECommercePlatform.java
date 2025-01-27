package com.encapsulation.e_commerce_platform;

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
}

