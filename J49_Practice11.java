package com.company;
abstract  class pen{
    abstract void write();
    abstract void refill();
}
class fountain_pen extends pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void change_nib (){
        System.out.println("Changing the nib");
    }
}
class monkey {
    void bite(){
        System.out.println("Biting 😂");
    }
    void jump(){
        System.out.println("jhumping jhapaak jhampak jhampak");
    }
}
interface basicanimal{
    void eat();
    void sleep();
    void repeat();
}
class Human extends monkey implements basicanimal {
    void speak(){
        System.out.println("Hello sir, how are you !");
    }
    public void sleep(){
        System.out.println("sleep");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void repeat(){
        System.out.println("repeating");
    }
}
public class J49_Practice11 {
    public static void main(String[] args) {
        // 1 Create a class Pen with methods write() and refill() as abstract methods
        // 2 Use the pen class from above to create a concrete class fountain_pen with additional method change_nib
        fountain_pen pen = new fountain_pen();
        pen.change_nib();
        // 3 Create a class monkey with jump() and bite() methods.Create a class Human which inherits this Monkey class and implements Basic animal
        // interface with eat() and sleep methods
        Human prince = new Human();
        prince.sleep();
        prince.eat();
        prince.repeat();
        prince.jump();
        prince.bite();
        // 4 Create a class telephone with ring(),lift(), and disconnect() methods as abstract methods.Create another class SmartTelephone and
        // demonstrate polymorphism
        //t.speak() ----> doesn't work
        //t.happy() ----> doesn't work
        // 5 Demonstrate polymorphism using monkey class from above question
        monkey m = new Human();
        //m.speak(); ---> cannot be used as a method because reference is monkey and has not any speak method
        basicanimal b = new Human();
        //b.speak() --- doesn't work
        b.eat();
        b.sleep();
        b.repeat();
        // 6 Create an interface TV remote and use it to inherit another interface Smart TV Remote
        //TVRemote s = new smartTVRemote();
        // 7 Create a class TV which implements TV Remote interface from above question
    }
}
