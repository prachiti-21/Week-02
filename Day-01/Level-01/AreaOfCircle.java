import java.util.Scanner;

public class AreaOfCircle {
    private double radius;
     AreaOfCircle(double radius) {
         this.radius = radius;

     }
     public double CalculateArea(double radius) {
         return Math.PI * radius * radius;
     }
     public void PrintArea() {
         System.out.println("Area = " + CalculateArea(radius));
     }
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter radius: ");
         double radius = input.nextDouble();
         AreaOfCircle obj = new AreaOfCircle(radius);
         obj.PrintArea();
     }
}
