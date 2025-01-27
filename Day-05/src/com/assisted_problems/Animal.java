package com.assisted_problems;

class Animall {
   public String name;
   public int age;
   Animall(String name,int age){
       this.name=name;
       this.age=age;
   }

   void makeSound(){
       System.out.println(name+" makes sound");
   }
}
class Dogg extends Animall{
    //public String name;
    //public int age;
    Dogg(String name,int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println("Dog barks");
    }

}
class Cat extends Animall{
    Cat(String name,int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println("com.assisted_problems.Cat meows");
    }
}
class Bird extends Animall{
    Bird(String name,int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println("com.assisted_problems.Bird chirps");
    }

    public static void main(String[] args) {
        Animall animal= new Animall("Lexi",3);
        animal.makeSound();
        Dogg dog= new Dogg("Bill",5);
        dog.makeSound();
        Cat cat= new Cat("Marry",4);
        cat.makeSound();
        Bird bird= new Bird("Chuchu",1);
        bird.makeSound();

    }
}
