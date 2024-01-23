package com.Elniel;

public class ReverseNum {

    public static void main(String[] args) {
        int n = 1244687;
        int rev = 0;

        while(n > 0) {
            int digit = n % 10; // get last current digit
            rev = (rev * 10) + digit;
            n = n / 10;
        }

        System.out.println("The reversed number: " + rev);
    }
}
