package com.company;
import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        System.out.println("Taking the input From the user");
        Scanner sc = new Scanner(System.in);  //here sc is just the name and it can be anything
        System.out.println("Enter the first number 1");
        int a = sc.nextInt();
        System.out.println("Enter the second number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of the two numbers is : ");
        System.out.println(sum);
    }
}