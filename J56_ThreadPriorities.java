package com.company;

class mythreadd extends Thread{
    public mythreadd(String name){
        super(name);
    }
    public void run(){
        int i = 35;
        while(true){
            System.out.println("Thank You "+ this.getName());
        }
    }
}
public class J56_ThreadPriorities {
    public static void main(String[] args) {
        // Ready Queue : 71 72 73 74 75
        mythreadd mt = new mythreadd("pinsu");
        mythreadd mt1 = new mythreadd("pinsu1");
        mythreadd mt2 = new mythreadd("pinsu2");
        mythreadd mt3 = new mythreadd("pinsu3");
        mythreadd mt4 = new mythreadd("pinsu4(most important)");
        mt4.setPriority(Thread.MAX_PRIORITY);
        mt.setPriority(Thread.MIN_PRIORITY);
        mt.start();
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
    }
}
