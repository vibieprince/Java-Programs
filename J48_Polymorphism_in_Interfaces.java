package com.company;
interface mycamera1{
    void take_snap();
    void record_video();
    private  void greet(){
        System.out.println("Good Morning ");
    }
    default void record4kvideo(){
        greet();
        System.out.println("Recording in 4k...");
    };
}
interface mywifi1{
    String[] get_networks();
    void connect_to_network(String network);
}
class my_cellphone1{
    void call_number(int phone_number){
        System.out.println("calling "+phone_number);
    }
    void pick_call(){
        System.out.println("connecting...");
    }
//    void take_snap(){
//        System.out.println("Taking a snap...");mm
//    }
}
class my_smartphone1 extends my_cellphone1 implements mywifi1,mycamera1{
    public void take_snap(){
        System.out.println("Taking snap");
    }
    public void record_video() {
        System.out.println("Taking Snap");
    }
//    public void record4kvideo() {
//        System.out.println("Taking snap and Recording in 4k...");
//    }

    public String[] get_networks(){
        System.out.println("Getting List of networks");
        String[] networklist = {"Krishna","Prince","Kartikay5G"};
        return networklist;
    }
    public void connect_to_network(String network){
        System.out.println("Connecting to"+network);
    }
    public void samplemethod(){
        System.out.println("method");
    }
}
public class J48_Polymorphism_in_Interfaces {
    public static void main(String[] args) {
        mycamera1 cam = new my_smartphone1(); //this is a smartphone but, use it as a camera
        //ms.get_networks(); --> throws an error
        cam.record4kvideo();
        //cam.samplemethod(); --> throws an error
        my_smartphone1 s = new my_smartphone1();
        s.samplemethod();
        s.record_video();
        s.record4kvideo();
        s.get_networks();
        s.call_number(30326);
    }
}