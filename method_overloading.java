package com.company;

public class method_overloading {
    public static void main(String[] args) {
        System.out.println("method overloading" );
        int a= 7;
        int b = 7;
        int c = mymethod(a,b);
        int d = mymethod(a);
        System.out.println(c); //similar function is called but to resolve the issue of confusion the parameters differ
        System.out.println(d);
        a += 12;
        b += 10;
        System.out.println(a);/* this proves that java is pass by value language which means only the value of variable
                                is passed and not the address*/
        System.out.println(b);

    }
    public static int mymethod(int o, int p)
    {
        System.out.println("here the values of a and b are :=\t"+ o +"\t"+ p);
        return  o + p;
    }
    public static int mymethod(int k)
    {

        System.out.println(k);
        return k + 5;
    }
}
