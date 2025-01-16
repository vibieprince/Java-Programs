package com.company;
abstract class Parent{
    public Parent(){
        System.out.println("mai parent ka constructor hu");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();
}
class Child extends Parent{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void greet1(){
        System.out.println("Good evening");
    }
}
abstract class child extends Parent{
    public void BYE(){
        System.out.println("I am good");
    }
}
public class J44_Abstract {
    public static void main(String[] args) {
        //khayali pulaao
        //ek abstract method puuri class ko abstract bana deta hai
        //Parent P = new Parent(); - nhi chalega coz parent is a abstract
        Child C = new Child();
        //child c = new child(); - nhi chalega coz parent is a abstract
    }
}
