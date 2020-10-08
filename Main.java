package com.company;

public class Main {

    public static void main(String[] args) {
        teacher obj = new teacher();  //here the object of person is created and functions of person is called
        obj.teach();
        obj.name = "Rehan";
        obj.eat();
        obj.walk();
        singer o =  new singer(); //here we can inherit the  function of person class in singer and teacher class
        o.name = "Kōsei Arima";
        o.sing();
        o.eat(); // this function is overriding the function of parent class.



    }
} 