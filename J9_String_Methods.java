package com.company;
import java.util.Scanner;

public class J9_String_Methods {
    public static void main(String[] args) {
        String name = "Prince";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String jstring = name.toUpperCase();
        System.out.println(jstring);

        String nonTrimmedString = "   Prince   ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(2)); // agar mai 0 likhu too puuri spelling hee ajyegi
        System.out.println(name.substring(1,5));
        System.out.println(name.replace('r','p'));

        System.out.println(name.startsWith("Pr")); //true
        System.out.println(name.endsWith("Pr")); //false

        System.out.println(name.charAt(1));

        String modifiedName = "Pinsuuuu";
        System.out.println(modifiedName.indexOf("suu")); //agar kuchh match na mila too result -1 hoga

        System.out.println(modifiedName.indexOf("ins"));
        System.out.println(name.equals("Prince")); //true
        System.out.println(name.equalsIgnoreCase("PrINCE")); //true #case ignore honge

    }
}