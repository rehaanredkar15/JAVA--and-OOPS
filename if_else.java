package com.company;
import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        System.out.println("greetings according to time in 24hr format");
        Scanner one = new Scanner(System.in);
        int num = one.nextInt();
        if(num>6 && num<12)
        {
            System.out.println("good morning");
        }
        else if(num>12 && num<20)
        {
            System.out.println(" NOON");
        }
        else
        {
            System.out.println("NIGHT");
        }
    }
}
