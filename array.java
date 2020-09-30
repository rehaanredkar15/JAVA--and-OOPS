package com.company;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        System.out.println("THE USE OF ARRAY");
        int i ;
        int[] arr ;
        //int arr[] ;  this can also work but above is the java style declaration which is prefered
        arr = new int[10];
       // int[] arr = new int[10]; this is also valid
        for(i = 0;i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
