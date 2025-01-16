package com.company;

public class J12_Logical {
    public static void main(String[] args) {
        System.out.println("for logical and");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a&&b&&c){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        System.out.println("for logical or");
        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = true;
        if (a||b||c){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        System.out.println("for logical NOT");
        System.out.print("NOT(a) is ");
        System.out.println(!a);
        System.out.print("NOT(b) is ");
        System.out.println(!b);
    }
}
