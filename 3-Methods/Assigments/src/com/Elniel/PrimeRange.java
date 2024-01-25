package com.Elniel;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeRange {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        ArrayList<Integer> ans = getPrimeRange(num1, num2);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }


    static ArrayList<Integer> getPrimeRange(int M, int N) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                nums.add(i);
            }
        }
        return nums;
    }


    static boolean isPrime(int n) {

        if (n <= 1) return false;
        int c = 2;
        while(c * c <= n) {

            if (n % c == 0)
                return false;
            c++;
        }

        return (c * c) > n;
    }
}
