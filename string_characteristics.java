package com.company;

public class string_characteristics {
    public static void main(String[] args) {
        System.out.println("enter the string");
        String now = "REHAAAN";
        int value = now.length();
        System.out.println(value);
        String ls = now.toLowerCase();
        String ps = now.toUpperCase();
        System.out.println(ls);
        System.out.println(ps);
        String cutted = "   trimspaces   ";
        String trimmed = cutted.trim();
        System.out.println(trimmed);
        System.out.println(now.substring(2));
        System.out.println(now.substring(1,4));
        String name =  "kaif";
        System.out.println(name.replace('k','s')); //only for single letters and not for a whole word
        System.out.println(name.replace("ka","sksk")); //for more than one letter
        System.out.println(name.startsWith("kai")); // to check the starting of the tree it acts as boolean
        System.out.println(name.endsWith("f")); // to check the starting of the tree it acts as boolean
        System.out.println(name.charAt(3));// the character at that index
        System.out.println(name.indexOf("i"));
        System.out.println(" here we will learn \" how to use double quotes"); // using "

    }
}
