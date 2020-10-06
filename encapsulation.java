package com.company;

public class encapsulation {
    public static void main(String[] args) {
        student obj = new student();
        obj.setAge(10);
        System.out.println(obj.getAge());
        /* In encapsulation, the variables
            of a class will be hidden from other classes,
            and can be accessed only through the methods of their current class.*/

    }
}
