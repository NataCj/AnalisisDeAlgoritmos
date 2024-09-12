
package com.mycompany.freighttransport.vehicle;


public class Driver {
    private String name;  //1
    private String id;    //1
    private int age;      //1

    public Driver(String name, String id, int age) { //1
        this.name = name; //1
        this.id = id;     //1
        this.age = age;   //1
    }//1 -> 5

    public Driver() {     //1
        this.name="";     //1
        this.id="";       //1
        this.age=0;       //1
    }                     //1 -> 5

    public String getName() { //1
        return name;      //1
    }//1 -> 3

    public void setName(String name) {//1
        this.name = name; //1
    }//1->3

    public String getId() {//1
        return id;       //1
    }//1 -> 3

    public void setId(String id) { // 1
        this.id = id;   // 1
    } // 1 -> 3

    public int getAge() {//1
        return age;  //1   
    }//1-> 3

    public void setAge(int age) {//1
        this.age = age;  //1
    }//1-> 3

    @Override
    public String toString() {//1
        return "Driver{" + "name=" + name + ", id=" + id + ", age=" + age + '}'; //1
    }//1 -> 3
    
    //34
}
