package com.Elniel;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        while (true) {
            // take the operator as input
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();
                if (op == '+') {
                    res = num1 + num2;
                }
                else if (op == '-') {
                    res = num1 - num2;
                }
                else if (op == '*') {
                    res = num1 * num2;
                }
                else if (op == '/') {
                    if (num2 != 0) {
                        res = num1 / num2;
                    }
                }
                else if (op == '%') {
                    res = num1 / num2;
                }
                else if (op == 'x' || op == 'X') {
                    break;
                }
                else {
                    System.out.println("Please Enter a valid operator");
                }
                System.out.println("result = " + res);
            }
        }


    }
}
