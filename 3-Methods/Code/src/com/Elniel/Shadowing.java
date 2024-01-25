package com.Elniel;

public class Shadowing {
    // Shadowing is a practice of using two variables with name within the scope that overlaps
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x); // 10
        int x; // the class variable at line 5 is shadowed by this
//        System.out.println(x); // scope will begin when value is initialised

        x = 50;
        System.out.println(x); // 40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
