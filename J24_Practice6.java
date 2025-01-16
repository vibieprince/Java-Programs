package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class J24_Practice6 {
    public static void main(String[] args) {
        // Create an array of 5 floats and calculate their sum
        /*float [] marks = {45.8f,56.8f,93.2f,45.0f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is "+sum);
         */
        //Write a program to find out whether a given integer is present in an array or not.
        /*float [] marks = {45.8f,56.8f,93.2f,45.0f};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        float num = sc.nextFloat();
        boolean k = false;
        for(float element:marks){
            if(num==element){
                k = true;
                break;
            }
        }
        if(k){
            System.out.println("Yes,the value is present in the array");
        }
        else{
            System.out.println("No,the given value is not present in the array");
        }
         */
        // Calculate the average marks from an array containing marks of all students in Physics using for-each loop.
        /*float [] marks = {45.8f,56.8f,93.2f,45.0f};
        float sum =0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average marks is "+ sum/marks.length);
         */
        //Create a java program to add two matrices of size 2X3.
        /*int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{5,6,7},
                         {8,9,10}};
        int [][] result = {{0,0,0},
                           {0,0,0}};

        for (int i=0;i<mat1.length;i++){ //row number of times
            for (int j=0;i<mat1[i].length;j++){ // column number of times
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i=0;i<mat1.length;i++) { //row number of times
            for (int j = 0; i < mat1[i].length; j++) { // column number of times
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
         */
        // Write  a java program to reverse the elements of an array
        /*int [] arr = {1,2,3,4,5,6,7};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for (int i=0; i<n; i++) {
            //Swap a[i] and a[l-1-i]
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for(int element:arr){
            System.out.print(element + " ");
        }
         */
        //Write the java program to find the maximum and minimum element in an array.
        /*Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter the size of array : ");
        int n = sc.nextInt();
        int i,sum = 0;
        int []arr = new int[n]; //Creating N-size Array

        for (i=0; i<n; i++){
            System.out.print("\n Enter : ");
            arr[i] = sc.nextInt();
        }
        int max_element = arr[0], min_element = arr[0]; //Initializing with first element.
        for (i=0; i<n; i++){
            if (arr[i]> max_element){ //Checking Maaximum element
                max_element = arr[i];
            }
            if (arr[i] < min_element){ //Checking Minimum element
                min_element = arr[i];
            }
        }
        //Printing Result
        System.out.println("\n Maximum Number : "+max_element);
        System.out.println("\n Minimum Number : "+min_element);
         */
        //ALTERNATIVE WAY
        /*int [] arr = {1,21,3,455,6,34,67};
        int max = 0;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The maximum value in this array is "+max);
         */
        //Min and Max value in java
        // -2147483648
        // 2147483647
        //Write a java program to find whether an array is sorted pr not.
        /*boolean isorted = true;
        int [] arr = {1,2,3,4,5,34,67};
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isorted = false;
                break;
            }
            if (isorted){
                System.out.println("This array is sorted");
            }
            else{
                System.out.println("This array is not sorted");
            }
        }
         */
    }
}