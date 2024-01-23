package com.Elniel;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num1 = input.nextInt();

        // Type Casting
        int num = (int)(74365.756f);

        // Automatic type promotion in expression
        int a = 257;
        byte u = (byte)(a); // 256 % 256 = 1
        System.out.println(u);


        byte x = 50;
        byte y = 50;
        byte z = 100;
        int r = x * y / z; // it's convert them into integer while doing this expression
        System.out.println(r);

        // all short and char convert to int
        // all integer convert into float

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 34343.54f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        // float + int - double = double "all other types convert it to Biggest data type"
        System.out.println((f * b) + " " + (i / c) + " " + (d -s));
        System.out.println(result);
    }
}
