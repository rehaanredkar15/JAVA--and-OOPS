package com.company;
import java.util.Scanner;

public class user_greeting {
    public static void main(String[] args) {
        //small pratice set to learn java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String str = sc.next();
        System.out.println("HELLO " + str + " GOOD MORNING");
        System.out.println("Enter the kilometers which are to be converted in Miles:");
        double kil = sc.nextDouble();
        double mil = kil * 0.62137;
        System.out.println(mil);
        System.out.println("To check whether the entered no is integer:");
        System.out.print("enter the number to be checked:");
        System.out.print(sc.hasNextInt());//to check if it is integer
    }
}
