package com.company;

public class varaggs {
    public static int sum(int ...arr){  //here when a no of variables are passed we convert them to array with this declaration
        int result = 0;
        for(int a: arr)
        {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("passing more than one argument to the methods");
        int a = 10,b = 120;
        System.out.println("The sum of the varibles will be " + sum(a,b,6,5,4,1)); //we can also call an empty method

    }
}
