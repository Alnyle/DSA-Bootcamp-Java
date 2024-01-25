package com.Elniel;

import java.util.Arrays;

public class Overloading {

    public static void main(String[] args) {
        // function overloading decide which function to run at compile time
        // two or function have same but different argument number or different data types
        fun("Ahmed");

        demo(1,2,3,32);
        demo("John weak", "Muhammad Ali Clay", "Mike Tyson" , "George Foreman");
//        demo(); // it's will give because will not able to decide what function to run
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
