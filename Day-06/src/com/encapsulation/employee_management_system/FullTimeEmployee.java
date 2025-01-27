package com.encapsulation.employee_management_system;

 class FullTimeEmployee extends Employee implements Department{
    private double full_hours;
    private double hourly_salary;
    private String department;

    FullTimeEmployee(int employeeId, String name, double full_hours, double hourly_salary,String department,double baseSalary){
        super(employeeId,name,baseSalary);
        this.full_hours=full_hours;
        this.hourly_salary=hourly_salary;
        this.department=department;
    }


     public void calculateSalary () {
         double total_Salary_full = hourly_salary * full_hours;
         System.out.println("Total salary is: "+total_Salary_full);
     }
     public void assignDepartment(){
         System.out.println("Department of employee is "+department);
     }
     public void getDepartmentDetails(){
         System.out.println("Department: "+department);
     }
     void displayDetails(){
         System.out.println("Employee Id: "+getEmployeeId());
         System.out.println("Employee name: "+getName());
         System.out.println("Base salary: "+getBaseSalary());
     }

 }
