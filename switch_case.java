package com.company;
import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        System.out.println("Switch Case");
        Scanner num = new Scanner(System.in);
        int age = num.nextInt();
        switch(age){
            case 14:
                System.out.println("its 14");
                break;
            case 15:
                System.out.println("its 15");
                break;
            case 19:
                System.out.println("its 19");
                break;
            case 18:
                System.out.println("its 18");
                 break;
            default:
                System.out.println("wrong choice");
        }

    }
}
