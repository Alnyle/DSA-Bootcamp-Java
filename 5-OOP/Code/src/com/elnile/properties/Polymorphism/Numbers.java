package com.elnile.properties.Polymorphism;

public class Numbers {

    /*
        Type of Polymorphism
        1 - Compile Time / Static Polymorphism (Method overloading)
        Achieved via method Overloading
        same function name, but different argument, return type,
        example constructor
        A a = new A();
        A b = new A(1, 3);
     */

    // another example
    double sum(int a, double c) {
        return a + c;
    }

    double sum(long x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        Numbers obj = new Numbers();

        System.out.println(obj.sum(21, 51.0));
        System.out.println(obj.sum(21, 51.0));
    }
}
