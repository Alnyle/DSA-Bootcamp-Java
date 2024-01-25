package com.Elniel;

import java.util.Scanner;

public class NaturalNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int sum = naturalNumbersSum(n);
        System.out.println(sum);
    }


    static int naturalNumbersSum(int n) {
        int sum = 0;
        if (n <= 0) {
            return n;
        }
        sum = (n * (n + 1)) / 2;
        return sum;
    }
}
