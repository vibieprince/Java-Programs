package com.company;

class threading extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Good morning!");
        }
    }
}
class threading1 extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class J58_Practice13 {
    public static void main(String[] args) {
        // 1 Write a program to print "good morning" and "welcome" continuously on the screen in Java using Threads.
        // 2 Add a sleep method in welcome thread of question1 to delay its creation for 200ms
        /*
        threading th = new threading();
        threading1 th1 = new threading1();
        th.start();
        th1.start();
         */
        // 3 Demonstrate getString() and SetPriority() methods in java threads.
        /*
        threading th = new threading();
        threading1 th1 = new threading1();
        th.setPriority(6);
        th1.setPriority(9);
        System.out.println(th.getPriority());
        System.out.println(th1.getPriority());
        th.start();
        th1.start();
         */
        // 4 How do you get state of a given threat in Java?
        /*
        threading th = new threading();
        threading1 th1 = new threading1();
        System.out.println(th1.getState());
        th.start();
        th1.start();
         */
        // 5 How do you get reference to the current thread in Java?
        /*
        threading th = new threading();
        threading1 th1 = new threading1();
        th.start();
        th1.start();
        System.out.println(Thread.currentThread().getState());
         */
    }
}
