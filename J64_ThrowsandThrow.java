package com.company;
class negativeradiusexception extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative !";
    }
    @Override
    public String getMessage(){return "Radius can't be zero!";}
}
public class J64_ThrowsandThrow {
    public static float area(int r) throws negativeradiusexception{
        if (r<0){
            throw new negativeradiusexception();
        }
        double result = Math.PI * r * r;
        return (float) result;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        //Made by Prince
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        //Krishna - uses divide function created by Prince
        try{
//            int c = divide(6,0);
//            System.out.println(c);
            double ar = area(6);
        }
        catch(Exception e){
            System.out.println("Exception ahead !");
        }
    }
}