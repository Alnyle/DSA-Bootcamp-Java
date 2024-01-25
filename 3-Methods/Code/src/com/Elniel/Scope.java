package com.Elniel;

public class Scope {

    public static void main(String[] args) {

        // scope: it's mean where you can access your variables
        int a = 10;
        int b = 30;

        {
//          int a = 132; // already initialised outside the block in the same method, hence you cannot initialise again
            a = 21; // reassign the origin reference variable to some other value
            int d = 243; // values initialised in this block will remain in block
        }
//        System.out.println(c); // cannot use outside the block
    }


    static void random(int marks) {
        int num = 21;

    }
}
