package com.Ahmed;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        int copy = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, 3);
            n /= 10;
        }

        if (sum == copy)
            System.out.println("Number " + sum + " is armStrong Number");
        else
            System.out.println("Number " + sum + " is not armStrong Number");

    }
}
