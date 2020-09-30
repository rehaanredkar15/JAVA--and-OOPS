package com.company;
import java.util.Scanner;
public class bar_chart {
    public static void main(String[] args) {
        System.out.println("WE ARE PRINTING BAR CHART");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the lenght of array :=");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for( i=0 ;i < n ; i++)
        {
            arr[i] = sc.nextInt(); //for array input
        }
        int max = arr[0];
        for(i=1;i< arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i]; //to find the max element from the array which will be usefull later
            }

        }
        System.out.println("THe bar chart is as follows");
        for(int floor = max;floor >= 1; floor--) /*this loop runs through the heights of the bars
                                                    first it takes the highest height and checks through all the
                                                    building levels , along with the proper level and the bar no
                                                    */
        {
            for(int j=0; j < arr.length ;j++) /* this loop runs through one bar to the other that is it runs
                                                for the rows when we are at a certain level this helps us check
                                                 for each of the bar, (this checks bars and above loop checks heights )*/
            {
                if(arr[j] >= floor)
                {
                    System.out.print("*\t");//to print stars
                }
                else
                {
                    System.out.print("\t"); // to skip
                }
            }
            System.out.println(); // this is used to arrange the bars independently,acts like a enter key after each level/bar
        }
       /* for(int floor = max;floor >= 1; floor--) //here that java loop doesnt work because of max initialization
        {
            for (int k : arr) {  //java version of for loop
                if (k >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
            */

    }
}
