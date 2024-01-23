package com.Elniel;

import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int mx = Math.max(Math.max(a,b), c);
        System.out.println("Maximum number is: " + mx);


    }
}
