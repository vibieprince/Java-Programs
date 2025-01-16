package com.company;

class c1{
    public int x = 5;
    protected  int y = 45;
    int k = 6;
    private  int z = 68;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(k);
        System.out.println(z);
    }
}
public class J51_Acceess_Modifiers {
    public static void main(String[] args) {
        c1 c = new c1();
        //c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.k);
        //System.out.println(c.z); -- couldn't use
    }
}
