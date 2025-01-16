package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class JA78_Practice15 {
    public static void main(String[] args) {
        // Create an ArrayList and store names of 10 students inside it.Print it using a for each loop
        /*
        ArrayList ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for (Object o : ar)
        {System.out.println(o);}
         */
        // Use the Date class in Java to print time in the following format :
        // 21 : 47 : 02
        /*
        Date d =  new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
        */
        // Create a HashSet in java. Try to store duplicate elements inside this set and verify that only one instance is stored
        /*
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(8);
        s.add(78);
        s.add(67);
        s.add(8);
        System.out.println(s);
         */
        // Use the Calendar Class in Java to print Date in the following format :
        // 05-07-2023
        /*
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE) + "-" + c.get(Calendar.MONTH) + "-" + c.get(Calendar.YEAR));
        //OR
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = dt.format(df);
        System.out.println(date);
         */
        // Use the API in Java to print time in the following format :
        // 21 : 47 : 02

    }
}
