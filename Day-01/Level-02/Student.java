import java.util.Scanner;

public class Student {
    private String name;
    private int rollNumber;
    private double marks;
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public void Grade(double marks){
        if(marks>=80){
            System.out.println("Grade: A");
        }
        else if(marks>=60 && marks<=79){
            System.out.println("Grade: B");
        }
        else if(marks>=40 && marks<=59){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Grade: D");
        }
    }
    public void Display(){
        System.out.println("Name of student: " + name);
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = input.nextLine();
        System.out.println("Enter the roll number");
        int rollNumber = input.nextInt();
        System.out.println("Enter the marks");
        double marks = input.nextDouble();
        Student obj = new Student(name, rollNumber, marks);
        obj.Display();
        obj.Grade(marks);


    }
    }
