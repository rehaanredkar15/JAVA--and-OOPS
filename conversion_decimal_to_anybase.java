package com.company;
import java.util.Scanner;
public class conversion_decimal_anybase {
    public static void main(String[] args) {
        System.out.println("conversion of decimal to any base");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the decimal no");
        int num = sc.nextInt();
        System.out.println("enter the base to which you want to convert");
        int base = sc.nextInt();
        int converted = converter(num,base);
        System.out.println(converted);
    }
    public static int converter(int num , int base)
    {
        int rv = 0; // this variable will contain the new no
        int p = 1;   // first no will go in the decimal place (this variable is for the place)
        while(num > 0)
        {
            int done = num % base;  /*first we will shorten the no by dividing with base and store that
                                      reduced no in done (imp - here we will receive the remainder which should
                                       further written in reverse order to find the equivalent no*/
            num = num/base; /*now we will divide the no by base (here we will get the quotient which  will help us find
                                the next remainder  */
            rv  += done * p; /* now here we will multiply the remainder which we got with place  and add it with the next
                                remainder we will get */
            p = p * 10;   /* here we will increase the place value every time by 10
                                i.e it will increase from 10 to 100 to 10000 */
        }
        return rv;
    }
}
