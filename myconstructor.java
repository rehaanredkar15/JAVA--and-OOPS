package com.company;

class vehicles{
    String color;   // here the color should be declared outside the scope of constructor
    int wheels = 9;
    public vehicles(int noofwheels){
        wheels = noofwheels;    //this will initialise the wheels to be four whenever a object is created
        this.wheels = noofwheels; /* this keywords gives the reference to the current object
                                   , it is required to resolve the confusion between(baiscly it just points the current object*/
    }
    public vehicles(int noofvehicles,String color) // here we are using constructor overloading
    {
        this.wheels = noofvehicles;
        this.color = color;

    }
}
public class myconstructor {

    myconstructor() {
        System.out.println("this is a contructor");
    }

    public static void main(String[] args) {
        myconstructor obj = new myconstructor();  //when object is made the contructor gets called ,
                                               // here if the default constructor doesnt exists then it
                                                // will not be called when object is created

        vehicles obj2 = new vehicles(4);
        vehicles scooty = new vehicles(2);// parameters to a constructor
        vehicles erickshaw = new vehicles(3,"yellow");// parameters to a constructor
        System.out.println(obj2.wheels);
        System.out.println(scooty.wheels);
        System.out.println(erickshaw.wheels + " and the color is "+erickshaw.color);
    }
}
