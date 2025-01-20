// Employee Class
class Employee2 {
    public int employeeID;    // Public attribute
    protected String department;  // Protected attribute
    private double salary;      // Private attribute

    // Constructor
    public Employee2(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to access the salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify the salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }
}

// Manager Class (Subclass of Employee)
class Manager extends Employee2 {
    private String title;

    // Constructor
    public Manager(int employeeID, String department, double salary, String title) {
        super(employeeID, department, salary);
        this.title = title;
    }

    // Method to display employee and manager details
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        System.out.println("Title: " + title);
    }
}

// Main class with main method
public class Main {
    public static void main(String[] args) {
        // Creating an instance of Manager
        Manager manager = new Manager(101, "Sales", 75000.0, "Sales Manager");

        // Display manager information
        manager.displayEmployeeInfo();

        // Modify and display updated salary
        manager.setSalary(80000.0);
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}
