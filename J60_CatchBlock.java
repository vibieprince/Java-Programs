package com.company;

public class J60_CatchBlock {
    public static void main(String[] args) {
        int a = 81;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("The result is "+c);
        }
        catch(Exception e){
            System.out.println("We failed to divide. Reason : "+e);
        }
    }
}