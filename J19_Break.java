package com.company;

public class J19_Break {
    public static void main(String[] args) {
        //Break and continue using loops!

        /*
        for (int i=0; i<5; i++){
            System.out.print(i);
            System.out.println(" Java is great");
            if (i==2){
                System.out.println("Ending the loop");
                break;
            }
         */
          /*int i = 0;
          do{
              System.out.println(i);
              System.out.print("Java is great");
              if(i==2){
                  System.out.println("Ending the loop");
                  break;
              }
              i++;
        }while(i<5);
        System.out.println("Loop ends here");
        //something atpata here!
         */
        /*for (int i=0; i<50; i++){
        if(i==2){
            System.out.println("Ending the loop");
            continue;
        }
            System.out.println(i);
            System.out.println("Java is great");
        }
         */
        int i = 0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }while(i<5);
        System.out.println("Loop ends here");
    }
}
