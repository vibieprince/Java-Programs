package com.company;

class myemployee{
    private int id ;
    private String name;

    public String getName(){
        return name;
    }
    public void setname(String n){
        this.name = n;
    }

    public void setid(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class J33_Gettersetter {
    public static void main(String[] args) {
    myemployee prince = new myemployee();
    //prince.id = 56;
    //prince.name = "codewithpinsu"; ---> throws an error due to private access modifier
    prince.setname("codewithpinsu");
    System.out.println(prince.getName());
    prince.setid(234);
    System.out.println(prince.getId());
    }
}
