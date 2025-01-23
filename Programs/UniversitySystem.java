import java.util.ArrayList;
import java.util.List;

class Coursee {
    private String courseName;
    private Professor professor;
    private List<Studentt> enrolledStudents;

    public Coursee(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " has been assigned to " + courseName);
    }

    public void enrollStudent(Studentt student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.getName() + " has been enrolled in " + courseName);
    }

    public List<Studentt> getEnrolledStudents() {
        return enrolledStudents;
    }
}

class Studentt {
    private String name;

    public Studentt(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Coursee course) {
        course.enrollStudent(this);
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void assignToCourse(Coursee course) {
        course.assignProfessor(this);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        // Create courses
        Coursee course1 = new Coursee("Data Structures");
        Coursee course2 = new Coursee("Machine Learning");

        // Create students
        Studentt student1 = new Studentt("Alice");
        Studentt student2 = new Studentt("Bob");

        // Create professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Assign professors to courses
        professor1.assignToCourse(course1);
        professor2.assignToCourse(course2);

        // Enroll students in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);
        student1.enrollCourse(course2);

        // Display course details
        System.out.println("\nCourse: " + course1.getCourseName());
        System.out.println("Professor: " + course1.getProfessor().getName());
        System.out.println("Enrolled Students: ");
        for (Studentt s : course1.getEnrolledStudents()) {
            System.out.println(" - " + s.getName());
        }

        System.out.println("\nCourse: " + course2.getCourseName());
        System.out.println("Professor: " + course2.getProfessor().getName());
        System.out.println("Enrolled Students: ");
        for (Studentt s : course2.getEnrolledStudents()) {
            System.out.println(" - " + s.getName());
        }
    }
}
