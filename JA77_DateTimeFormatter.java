package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JA77_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the Date
        //System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("d/MM/yyyy -- E a"); // This is the format
        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;
        String mytime = dt.format(df1);
        String mydate = dt.format(df); // Creating date string date and format
        System.out.println(mydate);
        System.out.println(mytime);
    }
}
