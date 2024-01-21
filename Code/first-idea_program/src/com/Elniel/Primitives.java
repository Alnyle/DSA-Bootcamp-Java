package com.Elniel;

public class Primitives {

    public static void main(String[] args) {

        /* primitives any data type can not break even farther */

        int n = 223;
        int a = 324_000_000; // 324000000
        char letter = 'E';
        /*
            question: why we add 'f' at the end of float numbers;
            answer: because all decimal numbers by default
                    are type double if we want to store them in float we have to add 'f' to the end of the number
         */

        float weight = 35.7f;
        double largeDecimalNumbers = 4324532.532412;

        // integer numbers by default are integer we add 'L' to store them in Long
        long largeInteger = 53452863873232L;
        boolean check = false;

        // rubber class add more functionality to primitives
        Integer q = 42;
        System.out.println(q.byteValue());


        // string is not primitives
        String name = "Ahmed";
        System.out.println(name);

    }
}
