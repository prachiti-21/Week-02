import java.util.Scanner;

public class Course {
    //instance variables
    String courseName;
    int duration;
    double fee;

    //class variable
    static String instituteName;
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    //instance method
    public void displayCourseDetails(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
    }
    //class method
    public static void updateInstituteName(){
        instituteName="Technocrats Institute";
        System.out.println(instituteName);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Course Name: ");
        String courseName=input.nextLine();
        System.out.println("Enter Duration: ");
        int duration=input.nextInt();
        System.out.println("Enter Fee: ");
        double fee=input.nextDouble();
        Course c=new Course(courseName,duration,fee);
        System.out.println("Course details: ");
        //instance method
        c.displayCourseDetails();
        System.out.println("Updated Institute name:");

        //class method
        Course.updateInstituteName();
    }
}
