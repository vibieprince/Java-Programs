package com.company;

/**
 * This is a good class
 */
public class JA81_TagsInJavaDocs {
    /**
     *
     * @param args These are arguments simplified to command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * Hello world
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated  This method is deprecated please use + operator
     */
    public int add(int i,int j) throws Exception{
        if(i == 0){
            throw new Exception();
        }
        int c;
        c = i + j;
        return c;
    }
}
