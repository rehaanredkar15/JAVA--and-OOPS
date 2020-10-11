package com.company;

import java.util.stream.StreamSupport;
/* To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class
with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class:
 2) Java does not support "multiple inheritance" (a class can only inherit from one superclass).
  However, it can be achieved with interfaces, because the class can implement multiple interfaces.
   Note: To implement multiple interfaces, separate them with a comma (see example below).

*/



public  class person implements youtuber , student {
    public static void main(String[] args) {
        person obj = new person();
        obj.study();
        obj.makingvideo();
        /* upcasting can be done though the objects cannot be directly intialised */
        youtuber obj2 = obj; //here upcasting is done of the above object in obj2
        obj.makingvideo();


    }

    @Override
    public void makingvideo() {
        System.out.println("making nice videos");

    }

    @Override
    public void study() {
        System.out.println("study hard ");

    }
}
