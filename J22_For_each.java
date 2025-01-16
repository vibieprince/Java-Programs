package com.company;

public class J22_For_each {
    public static void main(String[] args) {
        int [] marks = {98,78,49,69,38};
        //float [] marks1 = {39,56,39,59,30.6f};
        System.out.println(marks.length);
        /*System.out.println(marks1[4]);
        String [] student = {"Prince","Prince 1","Prince 2","Prince 3"};
        System.out.println(student.length);
        System.out.println(student[3]);
        */
        //Displaying the Array (Naive way)
        System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Displaying the array (for loop)
        /*
        System.out.println("Printing by for loop");
        for (int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
        */
        //Write a java program to print the elements of an array in reverse order
        System.out.println("Printing by for loop in reverse order");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        //Displaying the array using for-each loop
        System.out.println("Printing by using for-each loop");
        for (int element : marks){
            System.out.println(element);
        }
    }
}
