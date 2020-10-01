package com.company;

final class Myclass //final is used to stop inherition by other classes
{
    int x = 5;
    String s = "rehan";
    final int u = 8;

}
public class classes_objects {
    public static void main(String[] args) {
        System.out.println("EVERYTHING ABOUT THE CLASSES");
        Myclass obj = new Myclass(); //declaration if objects in java
        Myclass obj2 = new Myclass();
        System.out.println(obj.x);
        //obj.u = 10;//this will give a error because a final variable cannot be changed
        System.out.println(obj.u);
        System.out.println(obj2.s);
    }
}
