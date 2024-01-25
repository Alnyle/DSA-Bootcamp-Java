package com.Elniel;

import java.util.Scanner;

public class Questions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(isPrime(n)) {
            System.out.println("The number is prime");
        }
        else {
            System.out.println("The number it's not prime");
        }


    }

    static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        int c = 2;
        while(c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
