package com.company;
import java.util.*;
public class JA69_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>(5);
        l1.add(15);
        l1.add(18);
        l1.add(19);

        l.add(6);
        l.add(18);
        l.add(2);
        l.add(7);
        l.add(4);
        l.add(0,5);
        l.add(0,1);
        l.addAll(l1);
        System.out.println(l.contains(78));
        System.out.println(l.indexOf(15));
        System.out.println(l.lastIndexOf(18));
//        l.clear();
        l.set(3,343);
        for(int i=0; i<l.size(); i++){
            System.out.print(l.get(i));
            System.out.print(",");
        }
    }
}