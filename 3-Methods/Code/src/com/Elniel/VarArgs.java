package com.Elniel;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        // variables length arguments: function used when we don't know how many arguments want pass to function
        fun(1,4,3, 43, 124, 32);
        plus2(1,2,43,4534);
        plus2(); // can take zero arguments
        multiple(1, 4, "John Doe", "James Adam");
    }

    // length of argument is not fixed it take any number of argument
    // a function take array of data type
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    // variable length argument should always last argument
    static void multiple(int a, int b, String ...v) {

    }


    static void plus2(int ...num) {

        for(int i : num) {
            System.out.println(i * 2);
        }
    }
}
