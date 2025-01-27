package com.hybrid_inheritance;

public class Person {
    String name;
    int id;
    Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    void displayInfo(){
        System.out.println("Name:"+name+" , "+id);
    }
}
interface Worker{
    void performDuties();
}

class Chef extends Person implements Worker{
    private String specialty;
    public Chef(String name,int id, String specialty){
        super(name,id);
        this.specialty=specialty;
    }
    @Override
    public void performDuties(){
        System.out.println(name+" (Chef) is preparing "+specialty+" dishes.");
    }
}

class Waiter extends Person implements Worker{
    private String section;
    public Waiter(String name,int id,String section){
        super(name,id);
        this.section=section;
    }
    @Override
    public void performDuties(){
        System.out.println(name+" (Waiter) is serving tables in the "+section+" section.");
    }

    public static void main(String[] args) {
        Chef chef=new Chef("John",101,"Italian");
        Waiter waiter= new Waiter("Emily",202,"Outdoor");

        chef.displayInfo();
        waiter.displayInfo();

        chef.performDuties();
        waiter.performDuties();
    }
}

