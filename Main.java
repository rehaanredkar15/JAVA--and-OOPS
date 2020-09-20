package com.company;// the package inside which our program is

public class Main {  //the class which has main function in it so it has name similar to main func

    public static void main(String[] args) {  /* the main function and here the
                                    static word is also used so that we can run the class without object s in c++
                                    (static makes the function independent), void main(no return)
                                    and the string args is used cause of the arguments which the function will
                                     get inside */
        System.out.print("The value of additions of the numbers will be : ");
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        System.out.println(num1 + num2 + num3);/*remember here first the matter is printed and then the ln (next line)
         is added */
    }
}
