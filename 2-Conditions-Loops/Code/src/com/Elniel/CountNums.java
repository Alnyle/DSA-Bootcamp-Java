package com.Elniel;

public class CountNums {
    public static void main(String[] args) {
        int n = 129044334;
        int counter = 0;
        while(n > 0) {
            int digit = n % 10;
            n = n / 10;
            if (digit == 4) counter++;
        }

        System.out.println("the digit 4 has occur: " + counter + " times");
    }
}
