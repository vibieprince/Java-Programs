package com.company;

class employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }

}

class cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void callfriend(){
        System.out.println("Calling Google...");
    }
}
class square {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class rectangle {
    int sidea;
    int sideb;
    public int area(){
        return sidea*sideb;
    }
    public int perimeter(){
        return 2*(sidea + sideb);
    }
}
class Tommy{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
class Circle {
    float radius;
    public float area(){
        return (3.14f)*(radius*radius);
    }
    public float circumference(){
        return 2*(3.14f)*radius;
    }
}
public class J32_Practice8 {
    public static void main(String[] args) {
        //Create a class employee with following properties and methods:
        //Salary(property)(int)
        //getsalary(method returning int)
        //name(property)(string)
        //getname(method returning string)
        //getname(methond changing string)
        /*
        employee Prince = new employee();
        Prince.setname("Code with Prince");
        Prince.salary = 433;
        System.out.println(Prince.getsalary());
        System.out.println(Prince.getname());
        */

        //Create a class cellphone with methods to print "ringing...","vibrating...",etc.
        /*
        cellphone asus = new cellphone();
        asus.callfriend();
        asus.vibrating();
        asus.ringing();
        */

        //Create a class Square with a method to initialise its side,calculating area,perimeter etc.
        /*
        square hello = new square();
        hello.side = 3;
        System.out.println(hello.area());
        System.out.println(hello.perimeter());
        */
        //Create a class Rectangle with a method to initialise its sides,calculating area,perimeter etc.
        /*
        rectangle hii = new rectangle();
        hii.sidea = 5;
        hii.sideb = 6;
        System.out.println(hii.area());
        System.out.println(hii.perimeter());
         */
        //Create a class TommyVercetti for Rockstar Games capable of hitting(print hitting),naming,firing etc.
        /*
        Tommy player = new Tommy();
        player.run();
        player.fire();
        player.hit();
         */
        //Create a class Circle with a method to initialise its radii,calculating area,circumference etc.
        /*
        Circle hey = new Circle();
        hey.radius = 5.0f;
        System.out.println(hey.area());
        System.out.println(hey.circumference());
        */
    }
}