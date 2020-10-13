package com.company;
/* this is used when we expect that there will be exception happening somewhere but we handle it our way and not
* let the program stop due to the exception */
public class exception_catching {
    public static void main(String[] args) {
        try{
            int a = 8;
            int b = 0;

            int c = a/b;
            System.out.println(c);

        }catch (ArithmeticException e){       //here we can add different catch statements for different exceptions
            System.out.println(e.getMessage() + "occured , please check your code ");
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a.getMessage()+"array out of bound");
        }catch(Exception e){  //this can take all the exceptions at once

        }finally {
            System.out.println("sorry for the inconvenience "); //last remarks after the exception catching
        }



        }
}
