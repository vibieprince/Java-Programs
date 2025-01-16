package com.company;
import java.util.Scanner;
public class J30_Practice7{
    static void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    static void pattern(int n){
        for(int i=0; i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n) {
        for (int i=n; i>0; i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    static float average(float...arr){
        float total = 0;
        for(float e:arr){
            total +=e;
        }
        float avg = total/arr.length;
        return avg;
    }
    //Sum(n) = 1 + 2 + 3 + ...... + n
    //Sum(n) = 1 + 2 + 3 + ...... + n-1 + n
    //Sum(n) = sum(n-1) + n
//    sum(3) = 3 + sum(2)
//    sum(3) = 3 + 2 + sum(1)
//    sum(3) = 3 + 2 + 1
    static int sum(int n){
        //Base Condition
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        //Write a java method to print multiplication table of a number n
        multiplication(7);

        //Write a program using functions to print the following pattern:
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
        pattern(6);
        //Write a Recursive Function to Calculate Sum of First n natural Number
        /*
        int c = sum(5);
        System.out.println(c);
        */

        //Write a function to print the following pattern
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
        pattern2(6);
        //Write a function to print nth term of fibonacci series using recursion.
        /*int result = fib(5);
        System.out.println(result);

        //Write a function to find average of a set of numbers passed as arguments
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to pass? : ");
        int a = sc.nextInt();
        float [] arr = new float[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter "+(i+1)+" th Element : ");
            float k = sc.nextFloat();
            arr[i] = k;
        }
        J30_Practice7  obj = new J30_Practice7();
        System.out.println("Average is : "+obj.average(arr));
        */
    }
}
