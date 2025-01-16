package com.company;

class a {
    public int a;
    public int prince(){
        return 1;
    }
    public void pinsu(){
        System.out.println("I am a method of class a");
    }
}
class b extends a{
    public void pinsu_(){
        System.out.println("I am a method of class b");
    }
    public void ppinsu(){
        System.out.println("I am a method of class b");
    }
}
public class J40_MethodsOverriding {
    public static void main(String[] args) {
        a a = new a();
        a.pinsu();

        b b = new b();
        b.pinsu_();
        b.pinsu();
        b.ppinsu();
    }
}