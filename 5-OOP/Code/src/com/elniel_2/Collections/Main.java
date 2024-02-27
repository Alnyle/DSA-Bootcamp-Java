package com.elniel_2.Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> ls = new LinkedList<>();

        // Vector is synchronous
        // ArrayList is faster because it's asynchronous
        // in ArrayList multiple threads can access same object
        // use ArrayList better than vector

        List<Integer> v = new Vector<>();
        v.add(21);
        v.add(23);
        v.add(94);
        v.add(111);
        System.out.println(v);

        list.add(43);
        list.add(12);
        list.add(64);
        list.add(22);
        System.out.println(list);
    }
}
