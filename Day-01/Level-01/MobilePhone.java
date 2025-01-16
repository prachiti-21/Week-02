import java.util.Scanner;

public class MobilePhone {
    private String brand;
    private String model;
    private double price;
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    // create method to display details
    public void DisplayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the brand: ");
        String brand = input.nextLine();
        System.out.print("Enter the model: ");
        String model = input.nextLine();
        System.out.print("Enter the price: ");
        double price = input.nextDouble();
        MobilePhone m = new MobilePhone(brand, model, price);
        m.DisplayDetails();
    }
}
