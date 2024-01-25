package com.Elniel;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        // primitive data type pass by value
        // while objects passed reference
        int a = 10;
        int b = 20;

        swap(a, b);
        System.out.println(a + " " + b);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
