package com.company;

public class exception_throw {
        public static void main(String[] args) {
            fun();


    }
    public static void  fun(){
        int a = 8;
        int b = 4;
        int c = a/b;
        System.out.println(c);

        boolean isdanger =  true;
        if(isdanger){
            throw new ArrayIndexOutOfBoundsException("danger ahead"); /*if u think something is causing the error then this
             throw  fucntion stops the executin */
        }
      }
}
