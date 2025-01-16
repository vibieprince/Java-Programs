package com.company;

public class J21_Arrays {
    public static void main(String[] args) {
        //Classroom of 50 students
        // 1.Create 500 variables
        // 2.Use arrays(recommended)
        //There are three main ways to create an array in java
        //1. Declaration and memory allocation
        // int [] marks = new int [5];

        //2. Declaration and then memory allocation
        int [] marks;
        marks = new int [5];
        // Initialization
        marks [0] = 100;
        marks [1] = 68;
        marks [2] = 57;
        marks [3] = 98;
        marks [4] = 69;

        //3. Declaration,memory allocation and initialization
        // marks[5] = 96; - throws error
        System.out.println(marks[4]);
    }
}
