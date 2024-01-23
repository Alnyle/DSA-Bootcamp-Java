package com.Elniel;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0; // first fibonacci number
        int b = 1; // second fibonacci number
        int count = 2; // counter tell we are now have second fibonacci number

        while(count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);

    }
}
