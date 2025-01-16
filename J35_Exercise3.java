package com.company;
import java.util.Random;
import java.util.Scanner;
class game{
    public int number;
    public int inputnumber;
    public int noofguesses = 0 ;

    public int getNoofguesses() {
        return noofguesses;
    }

    public void setNoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }

    game(){
        Random random = new Random();
        this.number = random.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("Enter the number you guess :");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }
    boolean iscorrectnumber(){
        noofguesses++;
        if (inputnumber == number){
            System.out.format("Yes you guesses it right, it was %d.\n You guesses it in %d attempts ",number,noofguesses);
        }
        else if(inputnumber<number){
            System.out.println("too low");
        }
        else if (inputnumber>number){
            System.out.println("too high");
        }
        return false;
    }
}
public class J35_Exercise3 {
    public static void main(String[] args) {
        /*
        Create a class Game, which allows a user to play "Guess the number" game once.
        Game should have the following methods:
         1. Constructor to generate the random number
         2. takeuserinput() to take a user input of number
         3. iscorrectnumber() to detect whether the number entered by the user is true
         4. getter and setter for noofguesses
         use properties such as noofguesses(int)
         */
             game g = new game();
             boolean b = false;
             while (!b) {
             g.takeuserinput();
             b = g.iscorrectnumber();
             System.out.println(b);
             }

    }
}