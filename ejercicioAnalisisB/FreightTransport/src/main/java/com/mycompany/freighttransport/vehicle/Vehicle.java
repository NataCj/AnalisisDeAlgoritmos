
package com.mycompany.freighttransport.vehicle;

import com.mycompany.freighttransport.packages.CantPackages;
import java.util.ArrayList;


public class Vehicle {
    private String vehicleType; //tipo de vehiculo   //1
    //private CantPackages loadingCapacity;
    private int kmTours;                             //1
    private String plate;                            //1
    private Driver drive;                            //1
    private ArrayList<Vehicle> listVehicles;         //n
    
    public Vehicle(String vehicleType, int kmTours,String plate, Driver drive) {//1
        this.vehicleType = vehicleType; //1
        this.kmTours = kmTours; //1
       // this.loadingCapacity= new CantPackages();
        this.plate=plate; //1
        this.drive=drive; //1
        this.listVehicles=new ArrayList(); //1
    } //1 -> 6

    public String getVehicleType() { //1
        return vehicleType; //1
    } //1 -> 3

    public void setVehicleType(String vehicleType) { //1
        this.vehicleType = vehicleType; //1
    } //1 -> 3

    public int getKmTours() { //1
        return kmTours; //1
    } //1 -> 3

    public void setKmTours(int kmTours) {//1
        this.kmTours = kmTours; //1
    }//1 -> 3

    public String getPlate() { //1
        return plate; //1
    }//1 -> 3

//    public void setPlate(String plate) {
//        this.plate = plate;
//    }

    public Driver getDrive() { //1
        return drive; //1
    }//1 -> 3

    public void setDrive(Driver drive) {//1
        this.drive = drive; //1
    }//1 -> 3

    public ArrayList<Vehicle> getListVehicles() { //1
        return listVehicles; //1
    }//1 -> 3

    public void setListVehicles(ArrayList<Vehicle> listVehicles) { //1
        this.listVehicles = listVehicles; //1
    }//1 -> 3

    
    public void registerVehicle(Vehicle vehicle){ //1
        for(Vehicle car: listVehicles){ //n + 1
            car.registerVehicle(vehicle); // n
        }//1
    }//1 -> 2n+4

    @Override
    public String toString() { //1
        return "Vehicle{" + "vehicleType=" + vehicleType + ", kmTours=" + kmTours + ", plate=" + plate + ", drive=" + drive + ", listVehicles=" + listVehicles + '}'; //1
    }//1 -> 3
    
    
}
