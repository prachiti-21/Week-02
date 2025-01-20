public class Person {
    private String name;
    private int age;
    Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    Person(Person other){
        this.name = other.name;
        this.age = other.age;
    }
    public static void main(String[] args) {
        Person p1=new Person("Prachiti",22);
        Person p2=new Person(p1);
        System.out.println("Original person: "+p1.name+" "+p1.age);
        System.out.println("cloned person: "+p2.name+" "+p2.age);
    }

}
