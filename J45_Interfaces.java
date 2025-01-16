package com.company;
interface Bicycle{
    int a = 45;
    void applybrake(int decrement);
    void speedup(int increment);
}
interface hornbicycle{
    void blowhornk3g();
    void blowhornmhn();
}
class avon implements Bicycle,hornbicycle{
    void blowhorn(){
        System.out.println("Pee pee Poo poo");
    }
    public void applybrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedup(int increment){
        System.out.println("Speeding UP");
    }
    public void blowhornk3g(){
        System.out.println("kabhi khushi kabhi gum pee pee peee peee");
    }
    public void blowhornmhn(){
        System.out.println("Mai hoon na po po po");
    }
}
public class J45_Interfaces {
    public static void main(String[] args) {
        avon cycleprince = new avon();
        cycleprince.applybrake(2);
        //You can create properties in Interfaces
        System.out.println(cycleprince.a);
        //You cannot modify the properties in Interfaces as they are final
        //cycleprince.a = 454;
        cycleprince.blowhorn();
        cycleprince.blowhornmhn();
        cycleprince.blowhornk3g();
    }
}