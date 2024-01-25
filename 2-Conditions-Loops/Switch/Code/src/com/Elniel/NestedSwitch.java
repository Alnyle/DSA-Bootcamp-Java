package com.Elniel;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

            switch (empID) {
            case 1:
                System.out.println("John Weak");
                break;
            case 2:
                System.out.println("James Adam");
                break;
            case 3:
                System.out.println("Employee number 3");
                 switch (department) {
                     case "IT":
                         System.out.println("IT Department");
                         break;
                     case "Management":
                         System.out.println("Management Department");
                         break;
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }

        // Better way by using enhanced switch statement 
        switch (empID) {
                case 1 ->  System.out.println("John Weak");
                case 2 -> System.out.println("James Adam");
                case 3 -> {
                    System.out.println("Employee number 3");
                    switch (department) {
                        case "IT" -> System.out.println("IT Department");
                        case "Management" -> System.out.println("Management Department");
                    }
                }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
