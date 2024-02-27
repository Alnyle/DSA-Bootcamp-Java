package com.elnile.lambdaFunction;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
        // basic lambda exmaple
//        arr.forEach((item) -> System.out.println(item * 2));
//        arr.forEach(item -> System.out.println(item * 3));

        // you can store lambda function inside a variable
        Consumer<Integer> fun = item -> System.out.println(item * 5);
        arr.forEach(fun);

        //overflow is non-recoverable detect
        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println("product = " + myCalculator.operate(5, 10, prod));
        System.out.println("sum = " + myCalculator.operate(5, 10, sum));
        System.out.println("sub = " + myCalculator.operate(5, 10, sub));
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}