import java.util.Scanner;

public class Item {
    private int itemCode;
    private String itemName;
    private double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public void DisplayDetails(){
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }
    public double totalCost(int quantity){
        return price * quantity;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the item code: ");
        int itemCode = input.nextInt();
        System.out.println("Enter the item name: ");
        String itemName = input.next();
        System.out.println("Enter the item price: ");
        double price = input.nextDouble();
        Item obj=new Item(itemCode, itemName, price);
        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();
        obj.DisplayDetails();
        double totalCost = obj.totalCost(quantity);
        System.out.println("Total Cost: " + totalCost);
        

    }
}
