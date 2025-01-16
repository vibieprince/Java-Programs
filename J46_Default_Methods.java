package com.company;
interface camera{
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
interface wifi{
    String[] get_networks();
    void connect_to_network(String network);
}
class my_cellphone{
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
class my_smartphone extends my_cellphone implements wifi,camera{
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
}
public class J46_Default_Methods {
    //Java does not support multiple inheritance directly but the similar concept can be achieved using interfaces
    public static void main(String[] args) {
        my_smartphone ms = new my_smartphone();
        ms.record4kvideo();
        //ms.greet(); --> throws an error
        String [] ar = ms.get_networks();
        for (String item:ar){
            System.out.println(item);
        }
    }
}