package com.company;
class thread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<40000){
            System.out.println("My cooking thread is running");
            System.out.println("I am happy!");
            i++;
        }

    }
}
class thread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("Thread 2 for chatting with her!");
            System.out.println("I am sad!");
            i++;
        }
    }
}
public class J53_Threading {
    public static void main(String[] args) {
        thread t = new thread();
        thread1 t1 = new thread1();
        t1.start();
        t.start();
    }
}
