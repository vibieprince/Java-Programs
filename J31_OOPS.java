package com.company;

//public class Employee{} - Error
 class Employee{   //ek program mein bss ek public class ho sakti hai
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getsalary(){
        return salary;
    }
}
public class J31_OOPS {
    public static void main(String[] args) {
        System.out.println("This is our custom Class");
        Employee Prince = new Employee(); // Instantiating a new Employee Object
        Employee Kartikay = new Employee(); // Instantiating a new Employee Object
        // setting attributes for prince
        Prince.id = 12;
        Prince.salary = 14;
        Prince.name= "CodewithPrince";

        //setting attributes for Kartikay
        Kartikay.id = 14;
        Kartikay.salary = 15;
        Kartikay.name = "Kartikay Rana";

        //Printing the attributes
        Prince.printdetails();
        Kartikay.printdetails();
        int salary = Kartikay.getsalary();
        System.out.println(salary);
        //System.out.println(Prince.id);
        //System.out.println(Prince.name);
    }
}
