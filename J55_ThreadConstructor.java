package com.company;

class mythread extends Thread{
    public mythread(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank You");
//        while (true){
//            System.out.println("I am a Thread!");
//        }
    }
}
public class J55_ThreadConstructor {
    public static void main(String[] args) {
        mythread mt = new mythread("pinsu");
        mythread mt1 = new mythread("pinsu_");
        mt.start();
        mt1.start();
        System.out.println("The id of this thread mt is : "+mt.getId());
        System.out.println("The id of this thread mt is : "+mt.getName());
        System.out.println("The name of this thread mt is : "+mt1.getId());
        System.out.println("The name of this thread mt is : "+mt1.getName());
    }
}