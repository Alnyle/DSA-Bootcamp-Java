package com.Elniel;

import java.util.Scanner;

public class Main {
                            // take what
    public static void main(String[] args) {
        System.out.println("Hello");
        // System.out: it's command line
        // println: it's print the argument that pass to println funcition (int, string,double..)


        Scanner input = new Scanner(System.in);
        // Scanner: class let take input from (file, buffer..)
        // System.in : 'in' is the input it's self took from keyboard terminal "pass input from terminal"

        // input.nextInt(); take int input
        System.out.println(input.nextLine()); // take input and print it


    }
}