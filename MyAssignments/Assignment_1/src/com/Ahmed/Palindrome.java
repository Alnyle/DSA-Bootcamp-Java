package com.Ahmed;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.next();
        boolean flag = true;
        int size = str.length();
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(size - 1 - i)) {
                flag = false;
                break;
            }
        }

        String answer = flag ? "String is Palindrome" : "String is not Palindrome";
        System.out.println(answer);


    }
}
