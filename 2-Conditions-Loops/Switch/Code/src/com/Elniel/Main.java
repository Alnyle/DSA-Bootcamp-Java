package com.Elniel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next().trim();

        // == : check the reference
        // equal : check the value


//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruit");
//            case "apple" -> System.out.println("a sweet red fruit");
//            case "orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("small fruit");
//            default -> System.out.println("Please Enter a valid fruit");
//        }

        System.out.print("Enter a day: ");
        int day = in.nextInt();
        System.out.println();

//        switch (day) {
//            case 1 -> {
//                System.out.println("Monday");
//            }
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        switch (day) {
            case 1,2,3,4 -> System.out.println("Thursday");
            case 5,6,7 -> System.out.println("Saturday");
        }
    }
}