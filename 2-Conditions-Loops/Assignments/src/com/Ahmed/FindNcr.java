package com.Ahmed;

import java.util.Scanner;

public interface FindNcr {

    public static int fact(int num) {
        int facNumber = 1;
        for(int i = 1; i <= num; i++) {
            facNumber *= i;
        }
        return facNumber;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three Numbers n r p: ");
        int n = in.nextInt();
        int r = in.nextInt();
        int p = in.nextInt();

        System.out.println();
        int result = (fact(n) / (fact(r) * (fact(n - r)))) % p;
        System.out.println(result);


    }


}
