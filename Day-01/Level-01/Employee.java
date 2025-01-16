public class Employee {
    private String name;
    private int id;
    private double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void Display(){
        System.out.println("The employee details are:");
        System.out.println("Name of employee: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee salary: "+salary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 10, 500);
        Employee emp2 = new Employee("Prachiti", 8, 200);
       emp1.Display();
       emp2.Display();
    }
}
