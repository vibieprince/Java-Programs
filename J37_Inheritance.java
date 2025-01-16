package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printme(){
        System.out.println("I am a constructor");
    }
}
class Derive extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class J37_Inheritance {
    public static void main(String[] args) {
        //Creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        //Creating an object of Derived class
        Derive d = new Derive();
        d.setY(43);
        System.out.println(d.getY());
    }
}