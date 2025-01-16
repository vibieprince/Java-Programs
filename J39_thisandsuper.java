package com.company;

class ekclass{
    int a;

    public int getA(){
        return a;
    }

    ekclass(int y){
        this.a = y;
    }
    public int returnone(){
        return 1;
    }
}

class doclass extends ekclass{
    doclass(int c){
        super(c);
        System.out.println("Main ek constructor hu");
    }
}
public class J39_thisandsuper {
    public static void main(String[] args) {
       ekclass e = new ekclass(65);
        System.out.println(e.getA());
        doclass dc =  new doclass(5);
    }
}
