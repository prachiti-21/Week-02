package com.assisted_problems;

public class Employeee {
    String name;
    int id;
    double salary;

    Employeee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}
 class Manager extends Employeee{
        int teamsize;
        Manager(String name,int id,double salary,int teamsize){

            super("Rita",32,70000);
            this.teamsize=teamsize;
 }
  void displayDetails(){
      System.out.println("Name of manager: "+name);
      System.out.println("Employee id: "+id);
      System.out.println("Salary: "+ salary);
      System.out.println("Team size: "+10);
  }
}
class Developer extends Employeee{
    String programmingLanguage;
    Developer(String name,int id,double salary,String programmingLanguage){
        super("Alina",34,90000);
        this.programmingLanguage=programmingLanguage;
    }
    void displayDetails(){
        System.out.println("Name of com.assisted_problems.Developer: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Salary: "+ salary);
        System.out.println("Programming Language: "+programmingLanguage);
    }
}
class Intern extends Employeee{
    Intern(String name,int age,double salary){
        super("Raj",21,15000);
    }
    void displayDetails(){
        System.out.println("Name of com.assisted_problems.Intern: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Salary: "+ salary);
    }

    public static void main(String[] args) {
        Employeee employee= new Employeee("Hari",36,34000);
        Manager manager= new Manager("Rita",32,70000,10);
        Developer developer= new Developer("Alina",34,90000,"JAVA");
        Intern intern =new Intern("Raj",21,15000);
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();

    }

}
