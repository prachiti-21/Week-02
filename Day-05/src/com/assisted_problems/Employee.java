package com.assisted_problems;

public class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    Employee(int employeeId,String name,double baseSalary){
        this.employeeId=employeeId;
        this.name= name;
        this.baseSalary=baseSalary;
        //setBaseSalary(baseSalary);
    }
    public void calculateSalary();
     public int getEmployeeId(){
        return employeeId;
    }
    public String getName(){
         return name;
    }
    public double getBaseSalary(){
         return baseSalary;
    }
    void displayDetails(){
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee name: "+name);
        System.out.println("Base salary: "+baseSalary);
    }
}
