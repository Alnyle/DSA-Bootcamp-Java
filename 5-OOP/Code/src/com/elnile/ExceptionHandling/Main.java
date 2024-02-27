package com.elnile.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {

//            throw new Exception("Just for fun");
//            System.out.println(divide(a, b));
            String name = "Elniel";
            if (name.equals("Elniel")) {
                throw new MyException("Name is " + name);
            }

        } catch(MyException e) {
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will always execute");
        }

        System.out.println("Keep going");
    }


    // throws: tell you if you use this method it's may throw an Exception
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }

        return a / b;
    }
}
