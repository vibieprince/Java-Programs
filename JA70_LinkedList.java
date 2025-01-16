package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class JA70_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        LinkedList<Integer> l1 = new LinkedList<>();
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
        l.addLast(6);
        l.addFirst(788);
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