package com.company;


class Mymainemployee{
    private int id;
    private String name;

    public Mymainemployee(){
        id = 0;
        name = "Your-name-here";
    }
    public Mymainemployee(String myname,int myid){
        id = myid;
        name = myname;
    }
    public Mymainemployee(String myname){
        id = 1;
        name = myname;
    }
    public String getname() {return name;}
    public void setname(String n) {this.name=n;}
    public void setId(int i){this.id=1;}
    public int getId() {return id;}

}
public class J34_Constructors {
    public static void main(String[] args) {
        //Mymainemployee prince = new Mymainemployee("code with pinsu",78);
        //Mymainemployee prince = new Mymainemployee();
        Mymainemployee prince = new Mymainemployee("codewithharry");
        //prince.setname("code with pinsu");
        //prince.setId(24);
        System.out.println(prince.getname());
        System.out.println(prince.getId());
    }
}

//QUICK QUIZ : Overload the Employee Constructor to initialize the salary to Rs. 10,000
class Constructor{
    private String name;
    private int salary;

    Constructor(){
        name = "Default";
        salary = 00;
    }
    Constructor(int s){
        name = "Overload";
        salary = s;
    }
    public int getSalary(){
        return salary;
    }
}

class ConstructorExe{
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        Constructor obj1 = new Constructor(10000);

        System.out.println(obj.getSalary());
        System.out.println(obj1.getSalary());
    }
}