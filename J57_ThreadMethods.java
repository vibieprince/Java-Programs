package com.company;

class mynewthread extends Thread{
        public void run(){
            while(true){
                System.out.println("Thank you thread");
                try {
                    Thread.sleep(455);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
}

class mynewthread1 extends Thread{
    public void run(){
        while (true){
            System.out.println("Thank You thread1 ");
        }
    }
}
public class J57_ThreadMethods {
    public static void main(String[] args) {
        mynewthread mt1 = new mynewthread();
        mynewthread1 mt2 = new mynewthread1();
        mt1.start();
//        try{
//            mt1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        mt2.start();
    }
}