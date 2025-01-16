package com.company;
import java.util.Scanner;

public class J13_Switchcase {
    public static void main(String[] args) {
        char var = 'r';

        switch (var) {
            case 'c':
                System.out.println("Your are going to be an adult");
                break;
            case 'k':
                System.out.println("You are going to get a job");
                break;
            case 'd':
                System.out.println("You are being older");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println("Thanks for using my java program");
    }
}


//switch (var) {
//        case 'c' -> {
//        System.out.println("Your are going to be an adult");
//        System.out.println("Your are going to be an adult");
//        System.out.println("Your are going to be an adult");
//        }
//        case 'k' -> System.out.println("You are going to get a job");
//        case 'd' -> System.out.println("You are being older");
//default -> System.out.println("Enjoy your life");
// # enhanced switch
//switch (var) {
//        case 'c' -> System.out.println("Your are going to be an adult");
//        case 'k' -> System.out.println("You are going to get a job");
//        case 'd' -> System.out.println("You are being older");
//default -> System.out.println("Enjoy your life");
//        }
//        System.out.println("Thanks for using my java program");

//        /*
//        int age;
//        System.out.println("Enter your age");
//        Scanner sc = new Scanner(System.in);
//        age = sc.nextInt();
//        if (age>56){
//            System.out.println("You are experienced");
//        }
//        else if(age>46){
//            System.out.println("You are semi experienced");
//        }
//        else if(age>36){
//            System.out.println("You are semi-semi experienced");
//        }
//        else{
//            System.out.println("NOBDE KAHI KE");
//        }
//        if(age>3){
//            System.out.println("You are not a baby");
//
//         */



