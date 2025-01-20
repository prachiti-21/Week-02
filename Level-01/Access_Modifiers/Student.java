public class Student {
    // Public Variable
    public int rollNumber;

    // Protected Variable
    protected String name;

    // Private Variable
    private double CGPA;

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }

    // Subclass to demonstrate use of protected members
    public static class PostgraduateStudent extends Student {
        private String thesisTitle;

        // Constructor for PostgraduateStudent
        public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
            super(rollNumber, name, CGPA);
            this.thesisTitle = thesisTitle;
        }

        // Method to display postgraduate student details
        public void displayPostgraduateDetails() {
            displayStudentDetails(); // Access protected member
            System.out.println("Thesis Title: " + thesisTitle);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(101, "Alice", 3.8);
        student.displayStudentDetails();

        // Modify and display CGPA
        student.setCGPA(3.9);
        System.out.println("Updated CGPA: " + student.getCGPA());

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Bob", 3.7, "AI in Healthcare");
        pgStudent.displayPostgraduateDetails();
    }
}
