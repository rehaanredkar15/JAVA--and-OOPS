package com.company;

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
