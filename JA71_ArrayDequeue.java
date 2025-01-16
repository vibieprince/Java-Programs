package com.company;

import java.util.ArrayDeque;

public class JA71_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(56);
        ad.add(78);
        ad.add(54);
        ad.addFirst(5);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
    }
}
