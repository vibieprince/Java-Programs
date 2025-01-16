package com.company;
interface sampleinterface {
    void method1();
    void method2();
}
interface childsampleinterface extends sampleinterface{
//    void method1();
//    void method2();
    void method3();
    void method4();
}
class mysampleclass implements childsampleinterface{
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        System.out.println("Method 2");
    }
    public void method3(){
        System.out.println("Method 3");
    }
    public void method4(){
        System.out.println("Method 4");
    }
}
public class J47_Inheritance_in_Interfaces {
    public static void main(String[] args) {
        mysampleclass sc = new mysampleclass();
        sc.method1();
        sc.method2();
        sc.method3();
        sc.method4();
    }
}
