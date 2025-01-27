package com.assisted_problems;

import java.util.ArrayList;

public class Vehiclee {
    public double maxSpeed;
    public String fuelType;
    Vehiclee(double maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    void displayInfo(){
        System.out.println("Maximum Speed: "+maxSpeed);
        System.out.println("Fuel type: "+fuelType);
    }

}
class Car extends Vehiclee{
    public int seatCapacity;
    Car(double maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
    }
    void displayInfo(){
        System.out.println("com.assisted_problems.Car:");
        System.out.println("Maximum Speed: "+maxSpeed);
        System.out.println("Fuel type: "+fuelType);
        System.out.println("Seat capacity: "+seatCapacity);
    }
}
class Truck extends Vehiclee{
    Truck(double maxSpeed,String fuelType){
        super(maxSpeed,fuelType);

    }
    void displayInfo(){
        System.out.println("com.assisted_problems.Truck:");
        System.out.println("Maximum Speed: "+maxSpeed);
        System.out.println("Fuel type: "+fuelType);
    }
}
class Motorcycle extends Vehiclee{
    Motorcycle(double maxSpeed,String fuelType){
        super(maxSpeed,fuelType);
    }
    void displayInfo(){
        System.out.println("com.assisted_problems.Motorcycle:");
        System.out.println("Maximum Speed: "+maxSpeed);
        System.out.println("Fuel type: "+fuelType);
    }

    public static void main(String[] args) {
        ArrayList<Vehiclee>vehicles=new ArrayList<>();
        Vehiclee vehicle=new Vehiclee(120,"Diesel");
        Car car1= new Car(200,"Petrol",5);
        Car car2= new Car(250,"Petrol",7);
        Motorcycle motorcycle=new Motorcycle(300,"Petrol");
        Truck truck=new Truck(150,"Diesel");
        vehicles.add(vehicle);
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(motorcycle);
        vehicles.add(truck);
        for(Vehiclee vehiclee:vehicles){
            vehiclee.displayInfo();
        }
    }
}
