package com.Elnile.Introducation;


public class WrapperClass {
    public static void main(String[] args) {
        Integer a = 10;


        // Create as an Object
        Integer b = 41;
        swap(a, b);
        System.out.println(a + " " + b);

        // final: like const it will make sure your variable will not change
        // Note: final variable always initialize while declaring
        final int n = 122;

        final A Ahmed = new A("Ahmed Elniel");
        System.out.println(Ahmed.name);

        // when a non primitive is final, can not reassign it.
//        Ahmed = new A("John Doe");
        A obj;

        for (int i = 0; i < 1000000000; i++) {
            obj = new A("New Object");

        }


    }


    // values will not
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int d = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    // finalize: called after object destroyed
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}