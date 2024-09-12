//Karen Marcela Bayona 
// Código= 192215
package com.mycompany.freighttransport;

import com.mycompany.freighttransport.packages.CantPackages;
import com.mycompany.freighttransport.vehicle.Driver;
import com.mycompany.freighttransport.vehicle.Vehicle;

public class FreightTransport {

    public static void main(String[] args) {//1
        //Conductor
        Driver drive1= new Driver("Manuel","137664327",47);  //9
        Driver drive2= new Driver("Daniel","137664787",20); //9
        Driver drive3= new Driver(); //
        
        
        //Registrar vehiculo
        
        Vehicle vehicle1= new Vehicle("Camioneta", 3000,"KJ123",drive1); //3n+14 
        Vehicle vehicle2= new Vehicle("Carro", 3500,"KJT23",drive2);  //3n+14 
        Vehicle vehicle3= new Vehicle("Camión", 4000,"KJK23",drive3);  //3n+14 
        
        
        drive1.setName("Mauricio"); //1
        drive2.setAge(25); //1
        System.out.println("Datos del conductor 1: "+drive1.toString()); //1
        System.out.println("Datos del conductor 1: "+drive2.toString()); //1
        vehicle2.setKmTours(1000); //1
        vehicle1.setVehicleType("Motocarga"); //1
        System.out.println("Datos del vehiculo 1: "+vehicle1.toString()); //1
        
    }//1
}//1

