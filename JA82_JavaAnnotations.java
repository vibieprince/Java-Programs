package com.company;
@FunctionalInterface
interface myinterface{
    void thismethod();
    //void thismethod1();
}
class NewPhone extends Phone{
    @Override
    public void showtime(){
        System.out.println("Time is 8 pm");
    }
    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }
}
public class JA82_JavaAnnotations {
    @SuppressWarnings("Deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showtime();
        phone.sum(5,6);
    }
}