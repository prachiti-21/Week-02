package com.hierarchical_inheritance;

public class Personn {
    String name;
    int age;
    Personn(String name,int age){
        this.name=name;
        this.age=age;

    }

}
class Teacher extends Personn{
    String subject;

    Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }
    void displayRole(){
        System.out.println("Role is Teacher");
    }
}
class Student extends  Personn{
    String grade;
    Student(String name,int age,String grade){
        super(name,age);
        this.grade=grade;
    }
    void displayRole(){
        System.out.println("Role is Student");
    }
}
class Staff extends Personn{
    int staffsize;
    Staff(String name,int age,int staffsize){
        super(name,age);
        this.staffsize=staffsize;
    }
    void displayRole(){
        System.out.println("Role is staff with size "+staffsize);
    }

    public static void main(String[] args) {
        Personn person= new Personn("Prachiti",22);
        Teacher teacher= new Teacher("Avni",34,"Chemistry");

        Student student= new Student("Ani",19,"A");
        Staff staff= new Staff("Ramesh",45,10);
        student.displayRole();
        teacher.displayRole();
        staff.displayRole();
    }
}
