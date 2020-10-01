package com.company;


public class methods {
    public static void main(String[] args) {
        System.out.println("methods");      /*here we have written the method ahe main function in same class
                                              in same class we can create any amount of methods we want */
        int y = mymethod(7);
        System.out.println(y);
    }

    public static int mymethod(int s)   /* methods can also be called as functions as it works similarly to
                                           functions , here we can pass parameters also */ {
        System.out.println("hi");
        s = 9;
        return s;
    }
}
