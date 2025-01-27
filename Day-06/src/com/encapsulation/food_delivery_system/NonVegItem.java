package com.encapsulation.food_delivery_system;

class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private final double additionalCharge = 20.0; // Additional charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + additionalCharge) - discount;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = ((getPrice() * getQuantity()) + additionalCharge) * (discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discount;
    }
}

