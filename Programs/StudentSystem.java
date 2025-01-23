import java.util.ArrayList;
import java.util.List;

class Course {
     String name;
    private List<Student3> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        System.out.println("Course " + name + " created.");
    }

    public void enrollStudent(Student3 student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this);
            System.out.println("Student " + student.getName() + " enrolled in course " + name + ".");
        }
    }

    public void showStudents() {
        System.out.println("Students enrolled in course " + name + ":");
        for (Student3 student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

class Student3 {
    private String name;
    private List<Course> courses;

    public Student3(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        System.out.println("Student " + name + " created.");
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void showCourses() {
        System.out.println("Courses enrolled by student " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.name);
        }
    }
}

class School {
    private String name;
    private List<Student3> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        System.out.println("School " + name + " created.");
    }

    public void addStudent(Student3 student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Student " + student.getName() + " added to school " + name + ".");
        }
    }

    public void showStudents() {
        System.out.println("Students in school " + name + ":");
        for (Student3 student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

public class StudentSystem {
    public static void main(String[] args) {
        // Create a school
        School mySchool = new School("Greenwood High");

        // Create students
        Student3 alice = new Student3("Alice");
        Student3 bob = new Student3("Bob");

        // Add students to the school
        mySchool.addStudent(alice);
        mySchool.addStudent(bob);

        // Create courses
        Course math = new Course("Math");
        Course science = new Course("Science");

        // Enroll students in courses
        math.enrollStudent(alice);
        math.enrollStudent(bob);
        science.enrollStudent(alice);

        // Show enrolled courses for students
        alice.showCourses();
        bob.showCourses();

        // Show students in a course
        math.showStudents();
        science.showStudents();

        // Show all students in the school
        mySchool.showStudents();
    }
}
