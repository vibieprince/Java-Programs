package com.company;
import java.util.Scanner;
class myexception extends Exception{
    @Override
    public String toString(){
        return " I am toString()";
    }
    @Override
    public String getMessage(){
        return " I am getMessage()";
    }
}
class myageexception extends Exception{
    @Override
    public String toString(){
        return "Age cannot be greater than 125";
    }
    @Override
    public String getMessage(){
        return "Make sure that the value of age entered is correct ";
    }
}
public class J63_Exceptions {
    public static void main(String[] args) {
        int a = 8;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 99) {
            try {
                //throw new myexception();
                throw new ArithmeticException("This is an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace(); //konsa error konsi line
                System.out.println("Finished");
            }
        }
    }
}