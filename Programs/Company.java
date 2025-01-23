import java.util.*;
class Employee2 {
     String name;

    public Employee2(String name) {
        this.name = name;
        System.out.println("Employee " + name + " created.");
    }
}

class Department {
    private String name;
    private List<Employee2> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
        System.out.println("Department " + name + " created.");
    }

    public void addEmployee(String employeeName) {
        Employee2 employee = new Employee2(employeeName);
        employees.add(employee);
    }

    public void deleteDepartment() {
        System.out.println("Department " + name + " deleted.");
        for (Employee2 employee : employees) {
            System.out.println("Employee " + employee.name + " deleted.");
        }
        employees.clear();
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        System.out.println("Company " + name + " created.");
    }

    public Department addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departments.add(department);
        return department;
    }

    public void deleteCompany() {
        System.out.println("Company " + name + " deleted.");
        for (Department department : departments) {
            department.deleteDepartment();
        }
        departments.clear();
    }

    public static void main(String[] args) {
        // Create a company
        Company myCompany = new Company("TechCorp");

        // Add departments to the company
        Department dept1 = myCompany.addDepartment("Engineering");
        Department dept2 = myCompany.addDepartment("HR");

        // Add employees to the departments
        dept1.addEmployee("Alice");
        dept1.addEmployee("Bob");
        dept2.addEmployee("Charlie");

        // Delete the company
        myCompany.deleteCompany();
    }
}


