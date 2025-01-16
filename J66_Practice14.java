package com.company;

import java.util.Scanner;

public class J66_Practice14 {
    public static void main(String[] args) {
        //Write a Java program to demonstrate syntax logical & runtime errors.
        /*
        Syntax Error = int a = 5
        Logical Error = int age = 78;
                        int year born = 2000-78;
                        System.out.println(6/0);
         */
        // Write a Java program that prints "Haha" during Arithmetic exception and "Hehe" during an Illegal argument Exception
        /*
        try{
            int a = 666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }
         */
        //Write a Program that allows you to keep accessing an array until a valid index is given.If max retries exceeds 5 print Error.
        /*
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index ;
        int i = 0;
        while(flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is : " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }

        }
        if (i>=5){
            System.out.println("Error");
        }
         */
        //Modify program in 3rd question to throw a custom exception if more returns are recorded.
        //Wrap the program in 3rd inside a method which throws your custom Exception.
    }
}
