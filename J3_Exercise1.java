package com.company;
import java.util.Scanner;
// Write a program to calculate percentage of a given student in CBSE board.
// His marks from 5 subjects must be taken as input from the keyboard.
// (marks are out of 100)

public class J3_Exercise1 {
    public static void main(String[] args){
        System.out.println("CBSE Results 2023 percentage calculator");
        Scanner sc = new Scanner(System.in);
          System.out.println("English : ");
          float e = sc.nextInt();
          System.out.println("Mathematics : ");
          float m = sc.nextInt();
          System.out.println("Physics : ");
          float p = sc.nextInt();
          System.out.println("Chemistry : ");
          float c = sc.nextInt();
          System.out.println("CS/Physical : ");
          float pc = sc.nextInt();
          float sum = (e+m+p+c+pc);
          float div = sum/500;
          float per = div * 100;
          System.out.println("Your percentage is : ");
          System.out.println(per);
    }


}
