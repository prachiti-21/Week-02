package com.single_inheritance;

public class Device {
    int deviceId;
    String status;
    Device(int deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    void displayStatus(){
        System.out.println("single_inheritance.Device id: "+deviceId);
        System.out.println("Status: "+status);
    }
}
class Thermostat extends Device{
    String temperatureSetting;
    Thermostat(int deviceId,String status,String temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }
    void displayStatus(){
        System.out.println("single_inheritance.Device id: "+deviceId);
        System.out.println("Status: "+status);
        System.out.println("Temperature set in single_inheritance.Thermostat: "+temperatureSetting);
    }

    public static void main(String[] args) {
        Device device=new Device(1,"on");
        Thermostat thermostat=new Thermostat(2,"on","21'C");
        device.displayStatus();
        thermostat.displayStatus();
    }

}
