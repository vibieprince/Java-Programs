package com.company;
class circle{
    public int radius;
    circle(){
        System.out.println("I am non parameterized constructor of circle");
    }
    circle(int r){
        System.out.println("I am circle parameterized constructor ");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends circle{
    public int height;
    Cylinder(int r,int h){
        super(r);
        System.out.println("I am Cylinder parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class J43_Practice10{
    public static void main(String[] args) {
        //Create a class circle and use inheritance to create another Cylinder from it
        //circle obj = new circle(12);
        Cylinder obj = new Cylinder(12,4);
        //Create a class rectangle and inheritance to create another class cuboid.Try to keep it as close to real world scenario as possible.
        //Create methods for area and volume
    }
}