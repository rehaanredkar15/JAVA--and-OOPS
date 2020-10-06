package com.company;

public class encapsulation {
    public static void main(String[] args) {
        student obj = new student();
        obj.setAge(10);
        System.out.println(obj.getAge());
        /* In encapsulation, the variables
            of a class will be hidden from other classes,
            and can be accessed only through the methods of their current class.*/

    }
}
//following code will be in a different java class
public class student {
    private int age;
    private String a;

    public int getAge() //it will get the private age
    {
        return age;
    }
    public void setAge(int age) //setter help us to put restriction on private data
    {
        if(age > 12)
        {
            System.out.println("the child is too old");
        }
        else
        {
            this.age = age;
        }
    }
}
