package com.encapsulation.food_delivery_system;

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
}


