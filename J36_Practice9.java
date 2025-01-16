package com.company;

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class sphere {
    private int radius;

    public sphere(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public double getarea(){
        return 4*Math.PI*radius*radius;
    }
}
class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfacearea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class J36_Practice9 {
    public static void main(String[] args) {
        //Create a claass cylinder and use getters and setters to set its radius and height.
        /*
        cylinder mycylinder = new cylinder();
        mycylinder.setHeight(12);
        System.out.println(mycylinder.getHeight());
        mycylinder.setRadius(9);
        System.out.println(mycylinder.getRadius());
         */

        //Use above to calculate surface area and volume of the cylinder.
        /*
        System.out.println(mycylinder.surfacearea());
        System.out.println(mycylinder.volume());
        */

        // Use a constructor and repeat 1
        /*
        cylinder mycylinder = new cylinder(9,12);
        System.out.println(mycylinder.getRadius());
        System.out.println(mycylinder.getHeight());
        System.out.println(mycylinder.surfacearea());
        System.out.println(mycylinder.volume());
        */

        //Overload a constructor used to initialise a rectangle of length 4 and breadth 5 for using custom parameters.
        /*
        Rectangle r = new Rectangle();
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
        */
        //Create a class sphere and use getters and setters to set its radius
        /*
        sphere s = new sphere(5);
        System.out.println(s.getRadius());
        System.out.println(s.getarea());
        */
    }

}