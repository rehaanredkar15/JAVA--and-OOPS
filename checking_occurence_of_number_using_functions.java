package com.company;
import java.util.Scanner;

public class checking_occurence_of_number_using_functions {
    public static void main(String[] args)
    {
        System.out.println("USE OF FUNCTION");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number which is to be processed:");
        long num = sc.nextLong();
        System.out.print("enter the number which is to checked:");
        long check = sc.nextLong();
        long func = results(num,check);
        System.out.println(func);

    }
    public static int results(long num,long to_check)
    {
        int count = 0;
        while(num > 0)
        {
            long dig = num % 10;
            num = num / 10;
             if(dig == to_check)
             {
                 count++ ;
             }
        }
        return count;
    }
}
