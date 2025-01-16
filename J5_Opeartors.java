package com.company;

public class J5_Opeartors {
    public static void main(String[]args){
        //Arithmetic operator
        int a = 4;
        //int b = 6%a; //Modulo Operator
        // 4.8%1.1 --> Returns Decimal Remainder

        //Assignment operator
        int b = 9;
        b+= 3;
        System.out.println(b);

        //Comparison Operator
        System.out.println(8==9);
        System.out.println(6==6);
        System.out.println(65>8);

        //Logical Operators
        System.out.println(64>5 && 64>8); // jabtak sab true na ho value true nhi ayegi
        System.out.println(65<9 || 56>8); // koi ek bhi true hogya too result true ayega

        //Bitwise operator
        System.out.println(2&3);
    }
}
