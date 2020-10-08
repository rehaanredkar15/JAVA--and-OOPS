package com.company;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> colors =  new ArrayList<String>(); //declaration of the arraylist
            colors.add("red"); //adding the elements in the arraylist
            colors.add("green");
            colors.add("blue");
            colors.add("baigani");

        System.out.println(colors);
        System.out.println(colors.get(2)); //this helps us to get the string at 2 position
        colors.set(2,"purple");
        System.out.println(colors);
        colors.remove(3);  //removing element from the list
        System.out.println(colors);
    /* other important tools are addlast , addfirst ,removelast, removefirst*/
    }
}
