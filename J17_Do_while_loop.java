package com.company;

public class J17_Do_while_loop {
    public static void main(String[] args) {
        int a = 0;
        while(a<=5){
            System.out.println(a);
            a++;
        }
        int b = 10; //aur yaha 10 sedha print ho jyega unless of while loop
        do {
            System.out.println(b);
            b++;
        }while(b<=5);
        int c = 1;
        do{
            System.out.println(c);
            c++;
        }while(c<=45);
    }
}
