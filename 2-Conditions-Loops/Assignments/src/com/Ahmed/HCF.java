package com.Ahmed;

import java.util.Scanner;

public class HCF {
    static int c;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Highest common factor = Greatest Common Divisor (GCD)
        System.out.print("Enter two number A , B : ");
        int a = in.nextInt();
        int b = in.nextInt();
        c = Math.min(a, b);
        System.out.println(HFC(Math.max(a, b), Math.min(a,b)));
    }


    public static int HFC(int a, int b) {

        if (b <= 1)
            return 1;

        if (a % b == 0 && c % b == 0) {
            return b;
        }
        else {
            return HFC(a, b - 1);
        }
    }
}
