package com.company;

public class teacher extends person {  //extends keyword is used for inheritance
    public void teach(){
        System.out.println("The person is teaching");

    }
    public void walk(){
        super.walk(); // super is used by the subclass or child class to refer to the parent class
        System.out.println(name + " can walk");
    }

}
