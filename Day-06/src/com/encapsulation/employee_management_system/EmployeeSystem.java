package com.encapsulation.employee_management_system;

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee employee=new Employee(1,"John",3000);
        employee.getEmployeeId();
        employee.getBaseSalary();
        employee.getName();

        FullTimeEmployee fullTimeEmployee=new FullTimeEmployee(1,"John",9,100,"IT",40000);
        PartTimeEmployee partTimeEmployee= new PartTimeEmployee(2,"Lily",4,200,"Electronic",50000);

        fullTimeEmployee.assignDepartment();
        fullTimeEmployee.calculateSalary();
        fullTimeEmployee.getDepartmentDetails();
        fullTimeEmployee.displayDetails();

        partTimeEmployee.assignDepartment();
        partTimeEmployee.calculateSalary();
        partTimeEmployee.getDepartmentDetails();
        partTimeEmployee.displayDetails();
    }
}
