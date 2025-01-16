package com.company;
import java.util.Scanner;
public class J20_Practice5 {
    public static void main(String[] args) {
        //Write a program to print the following pattern
//         * * * * * *
//         * * * * *
//         * * * *
//         * * *
//         * *
//         *
          /*int n = 6;
          for (int i=n; i>0; i--){
              for(int j=0;j<i;j++){
                  System.out.print("* ");
              }
              System.out.print("\n");
          }
           */
          //Write a java program to sum first n even numbers using while loop
          /*
          int sum = 0;
          int n = 50;
          for(int i=0; i<n;i++){
              sum = sum + (2*i);
          }
        System.out.print("Sum of first " +n+ " even numbers is : ");
        System.out.println(sum);
           */
        //Write a program to print multiplication table of given number n
        /*int n = 5;
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
         */
        //Write a program to print multiplication table of 10 in reverse order
        /*
        int n = 10;
        for (int i=10; i>=1; i--){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
         */
        //Write a program to find factorial of a given number using for loops.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want : ");
        int n = sc.nextInt();
        int i = 1;
        int factorial = 1;
        while(i<=n){
            factorial *= i;
            i++;
        }
        System.out.print("The factorial of "+n+ " is : ");
        System.out.println(factorial);
         */
        //Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        /*int sum = 0;
        int n = 5;
        for(int i=1;i<=10;i++){
            int i1 = n * i;
            sum = sum + i1;
        }
        System.out.println(sum);
         */

    }
}
