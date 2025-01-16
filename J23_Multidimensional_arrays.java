package com.company;

public class J23_Multidimensional_arrays {
    public static void main(String[] args) {
        //int [] marks; //A 1-D Array
        int [][] flats; //A 2-D Array
        flats = new int [2][3];
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[1][0] = 200;
        flats[1][1] = 201   ;
        flats[1][2] = 202;

        //Displaying the 2-D Array(for loop)
        System.out.println("Printing a 2-D Array using for loop");
        for (int i=0;i<flats.length;i++){
            for(int j=0;i<flats[i].length;j++){
                System.out.println(flats[i][j]);
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}
