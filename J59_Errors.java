package com.company;

import java.util.Scanner;

public class J59_Errors {
    public static void main(String[] args) {
        //Error type 1
        /*
        int a = 5
        System.out.println(a);
         */
        //Error type 2
        /*
        int a = 5;
        System.out.println(a+b);
         */
        //Error type 3
        /*
        int a = 6;
        int b = 45;
        c = 93;
        System.out.println(c);
         */
        //Logical Error
        /* Write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for(int i = 1; i<5;i++){
            System.out.println(2*i+1);
        }
         */
        //Runtime Error
        /*
        int k ;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
         */
    }
}