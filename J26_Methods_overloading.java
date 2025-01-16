package com.company;

public class J26_Methods_overloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good morning "+ a + " br0!");
        System.out.println("Good morning "+ b + " br0!");
    }
    static void  foo(int a,int b,int c){
        System.out.println("Good morning "+ a + " br0!");
        System.out.println("Good morning "+ b + " br0!");
    }
    static void  change2(int[] arr){
        arr [0] = 98;
    }
    static void telljoke(){
        System.out.println("I invented a new word\n"+
                "Plagarism!");
    }

    public static void main(String[] args) {
        //telljoke();

        //case 1 : changing the integer
        /*
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is " + x);
         */
        //case 2 : changing the array
        /*
        int [] marks = {53,67,94,34,56};
        change2(marks);
        System.out.println(marks[0]);
         */
        //Method Overloading
        foo();
        foo(3000,0);
        foo(3000,4000);
        //Arguments are actual!
    }
}
