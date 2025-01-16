package com.company;

import java.sql.Time;

class Phone{
    public void on(){
        System.out.println("Turning on Phone...");
    }
    public void showtime(){
        System.out.println("Time is 8 am ");
    }
}
class Smartphone extends Phone{
    public void on(){
        System.out.println("Turning on Smartphone...");
    }
    public void music(){
        System.out.println("Playing music...");
    }
}
public class J41_DynamicMethodDispatch {
    public static void main(String[] args) {
        //Phone obj = new Phone();
        //Smartphone obj2 = new Smartphone();
        //obj.name();
        Phone obj = new Smartphone();
        //Smartphone obj2 = new Phone(); //not allowed
        obj.showtime();
        obj.on();
        //obj.music(); Not allowed
    }
}
