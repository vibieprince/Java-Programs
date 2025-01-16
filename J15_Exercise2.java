package com.company;

import java.util.Random;
import java.util.Scanner;

public class J15_Exercise2 {
    public static void main(String[] args) {
        // 1 for Rock
        // 2 for paper
        // 3 for Scissor

        Scanner sc = new Scanner(System.in);

        System.out.println("1 Rock");
        System.out.println("2 Paper");
        System.out.println("3 Scissor");

        System.out.println("Choose, paper/scissor/rock : ");

        int userinput = sc.nextInt(4);
        if (userinput== 1){
            System.out.println("You chosen : Rock");
        }
        else if (userinput==2){
            System.out.println("You chosen : Paper");
        }
        else {
            System.out.println("You Chosen : Scissor");
        }

        Random random = new Random();
        int input = random.nextInt(4);
        if (input == 1){
            System.out.println("Computer Chosen : Rock");
        }
        else if (input == 2){
            System.out.println("Computer chosen : Paper");
        }
        else {
            System.out.println("Computer Chosen : Scissor");
        }

        if (userinput == input){
            System.out.println("Tie");
        }
        else if (userinput == 1 && input == 3 || userinput == 2 && input == 1 || userinput == 3 && input == 2) {
            System.out.println("You won!");
        }
        else {
            System.out.println("You lost !");
        }

    }
}