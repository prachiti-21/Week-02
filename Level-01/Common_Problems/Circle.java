import java.util.Scanner;

public class Circle {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public static void main(String args[]){
        Circle c = new Circle(5);
        System.out.println(c.radius);
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        c.radius=input.nextDouble();
        System.out.println(c.radius);
    }
}
