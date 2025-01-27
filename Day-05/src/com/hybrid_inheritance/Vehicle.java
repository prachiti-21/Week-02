package com.hybrid_inheritance;

public class Vehicle {
    double maxSpeed;
    String model;
    Vehicle(double maxSpeed,String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }
}
interface Refuelable {
    public void refuel();

}
class ElectricVehicle extends Vehicle {
    double maxSpeed;
    String model;
    ElectricVehicle(double maxSpeed,String model){
        super(maxSpeed,model);
        this.maxSpeed=maxSpeed;
        this.model=model;
    }
    public void charge(){
        System.out.println(model+ " is charged.");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    double petrolcapacity;
    PetrolVehicle(double maxSpeed,String model,double petrolcapacity){
        super(maxSpeed,model);
        this.petrolcapacity=petrolcapacity;
    }
    @Override
    public void refuel(){
        System.out.println(model+" is refueled");
    }

    public static void main(String[] args) {
        ElectricVehicle ev= new ElectricVehicle(150,"Tesla");
        PetrolVehicle pv= new PetrolVehicle(200,"Toyota",100);
        ev.charge();
        pv.refuel();
    }
}
