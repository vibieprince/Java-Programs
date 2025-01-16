package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class J14_Practice4 {
    public static void main(String[] args) {
        //What will be the output?
        /*
        int a = 10;
        if(a==11){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
         */
        //Write a java program t find out whether a student is pass or fail; if it requires total
        // 40% and at least 33% in each subject to pass.Assume 3 subjects and take marks as an input
        // from the user.
        /*
        System.out.println("Passing status viewer");
        byte P,C,M;
        Scanner sc = new Scanner(System.in);

        System.out.println("Physics : ");
        P = sc.nextByte();

        System.out.println("Chemistry : ");
        C = sc.nextByte();

        System.out.println("Mathematics : ");
        M = sc.nextByte();
        float avg = (P+C+M)/3.0f;
        if(avg>=40 && P >= 33 && C >=33 && M >= 33) {
            System.out.println(avg+"%");
            System.out.println("Congratulations,You have passed");
        }
        else {
                System.out.println(avg+"%");
                System.out.println("Broo...! You passed,(passed away)");
        }
         */
        //Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        // Income slab          Tax
        // 2.5 L - 5.0L          5%
        // 5.0 L - 10.0L        20%
        // Above 10.0L          30%
        // Note that there is no tax below 2.5L.Take input amount as an input from the user.
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5f){
            tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income>5f && income <10f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The total tax you have to pay is "+ tax);
         */
        //Write a java program to find out the day of the week given the number [1 for Mondays, 2 for Tuesday... and so on!]
        /*System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
         */
        //Write a java program to find whether a year entered by the user is a leap year or not.
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Leap year checker");
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        if(((year%4 ==0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println(year +" is a leap year");
        }
        else{
            System.out.println(year +" is not a leap year");
        }
        */
        //Write a program to find out the type of website from the url
        //.com -> commercial website
        // .org -> organizational website
        //.in -> indian website
        /*System.out.println("Enter the website : ");
        Scanner sc = new Scanner(System.in);
        String web = sc.next();
        if (web.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if (web.endsWith(".org")){
            System.out.println("This is a organizational website");
        }
        else if (web.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
         */

    }
}
