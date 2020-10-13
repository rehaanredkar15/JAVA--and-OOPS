package com.company;

public class exception_throws {
    public static void main(String[] args) {
        /* this THROWS is used when u guess that the function might cause an exception , it requires a catch and try func
        * as if the exception occurs the exception is handled else the function is easily handled  */
        func1();
    }
    public static void func1(){
        int a = 9;
        int b = 3;
        int c = a/b;
        System.out.println(c);

        try{
            func2();
        }catch(Exception e ){    // after the error is seen it is catched by this statement and then the exception is displayed
            System.out.println(e.getMessage() + "occured");
        }
    }
    static void func2()throws ArrayIndexOutOfBoundsException {  /* after the function is called in try block ,
                                                           it is received here and checked if  there is error the throws looks for it*/
        boolean isdanger  = true;
        if(isdanger){
            throw new ArrayIndexOutOfBoundsException(" danger is coming and error has ");
        }
    }
}
