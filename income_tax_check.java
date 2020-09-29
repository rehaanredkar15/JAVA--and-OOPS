package com.company;
import java.util.Scanner;
public class income_tax_check {
    public static void main(String[] args) {
        System.out.println("INCOME TAX CHECKER");
        Scanner income = new Scanner(System.in);
        System.out.print("Enter your income : ");
        float inc = income.nextFloat();
        float tax=0;
        if (inc <= 2.5f)  // the employee earning less than 2.5 will not pay tax
        {
            tax = tax + 0;
        }
        else if( inc >= 2.5f && inc <= 5f)
        {
            tax = tax + 0.05f * (inc - 2.5f);
        }
        else if( inc > 5.0f && inc <= 10.0f)
        {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (inc - 5f);
        }
        else if( inc > 10.0f)
        {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.2f * (inc - 10.0f);
        }
        System.out.println(" Hence the tax payed by the employee will be:" + tax);
    }
}
