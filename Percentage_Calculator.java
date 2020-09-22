package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("PERCENTAGE CALCULATOR");
        Scanner one = new Scanner(System.in);
        System.out.println("enter the total no of marks");  /*further we can also use loops in the program to run the
                                                            program in any condition*/
        int no_of_marks = one.nextInt();
        System.out.println("enter the marks for first subject");
        int sub1 = one.nextInt();
        System.out.println("enter the marks for second subject");
        int sub2 = one.nextInt();
        System.out.println("enter the marks for third subject");
        int sub3 = one.nextInt();
        System.out.println("enter the marks for fourth subject");
        int sub4 = one.nextInt();
        System.out.println("enter the marks for fifth subject");
        int sub5 = one.nextInt();
        int sum ;
        sum = sub1+ sub2 + sub3 + sub4 + sub5;
        double percent;
        percent =  (double)sum/no_of_marks * 100;  /* here we can also write d at the end but that is only possible when
                                                    we have two integers and not variables or literals in that case we use
                                                    double written in brackets */
        System.out.print(" Congratulations your percentage is :"+percent);
        System.out.print(" %");

    }
}
