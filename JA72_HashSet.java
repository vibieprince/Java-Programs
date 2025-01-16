package com.company;

import java.util.HashSet;

public class JA72_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myhashset = new HashSet<>(6,0.5f);
        myhashset.add(6);
        myhashset.add(3);
        myhashset.add(76);
        myhashset.add(5);
        myhashset.add(11);
        myhashset.add(11);
        System.out.println(myhashset);
    }
}