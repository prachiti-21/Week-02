package com.encapsulation.food_delivery_system;

// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

// Interface Discountable
/*interface Discountable {
    void applyDiscount(double discountPercentage);
    String getDiscountDetails();
}

// Subclass VegItem
class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - discount;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = (getPrice() * getQuantity()) * (discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discount;
    }
}

// Subclass NonVegItem
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

// Main class to demonstrate functionality
public class FoodDeliverySystem {
    public static void processOrder(FoodItem foodItem) {
        System.out.println(foodItem.getItemDetails());
        System.out.println("Total Price: " + foodItem.calculateTotalPrice());

        if (foodItem instanceof Discountable) {
            Discountable discountable = (Discountable) foodItem;
            discountable.applyDiscount(10); // Apply a 10% discount
            System.out.println(discountable.getDiscountDetails());
            System.out.println("Price after discount: " + foodItem.calculateTotalPrice());
        }
    }

    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1);

        System.out.println("Processing Veg Item:");
        processOrder(vegItem);

        System.out.println("\nProcessing Non-Veg Item:");
        processOrder(nonVegItem);
    }
}*/

