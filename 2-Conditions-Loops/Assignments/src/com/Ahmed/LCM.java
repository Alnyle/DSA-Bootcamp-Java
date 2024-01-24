package com.Ahmed;

import java.util.Scanner;

public class LCM {
    /*
        LCM of two numbers = (Product of two numbers) / their HFC
        LCM(a,b) = (a * b) / HFC(a, b)
     */
    static int c;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Least Common multiple
        System.out.print("Enter two number A , B : ");
        int a = in.nextInt();
        int b = in.nextInt();
        c = Math.min(a, b);
        int GCD = (HFC(Math.max(a, b), Math.min(a, b)));
        int LCM = (a * b) / GCD;
        System.out.println("LCM of the two numbers is: " + LCM);
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
