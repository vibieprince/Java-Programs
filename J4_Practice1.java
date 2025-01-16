package com.company;
import java.util.Scanner;
// Write a java program which asks the user to enter his/her name  and greets them
// with "Hello <name>,have a good day" text

public class J4_Practice1 {
    public static void main(String[]args){
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");

        // Change kilometres to miles
//        System.out.println("Unit Converter");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Give a value");
//        float p = sc.nextInt();
//        double k = p*0.621371;
//        System.out.println("Changing Kilometres to miles...");
//        System.out.println(k);


    }
}
// hasNextInt use karo agar jaan na hai ki given value integer hai ki nhi


