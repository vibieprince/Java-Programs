package com.company;
class bases {
    bases() {
        System.out.println("I am a constructor ");
    }

    bases(int x) {
        System.out.println("I am an overloaded constructor with value of x as : "+ x);
    }
}
    class derived extends bases{
    derived(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    derived(int x,int y){
        super(x);
        System.out.println(" I am an overloaded constructor with value of y as : "+ y);
    }
}
class childofderived extends derived{
    childofderived(){
        System.out.println("I am a child of derived constructor ");
    }
    childofderived(int x, int y , int z){
        super(x,y);
        System.out.println(" I am an overloaded derived constructor with a value of z as :"+ z);
    }
}
public class J38_Constructors {
    public static void main(String[] args) {
        //bases h = new bases();
        //derived t = new derived();
        //derived t = new derived(14,6);
        //childofderived cd = new childofderived();
        childofderived cd = new childofderived(12,13,15);
    }
}