package com.Elnile.StaticExample;

public class Static {

    public static void main(String[] args) {

        staticFunction();



        // 1- why every function we call inside main function have to be static
        // because main function is static

        // 2- this function will give you error?
        // because you can not call non-static function inside static function
        
        nonStaticFunction();
    }

    static void staticFunction() {
        System.out.println("Hello from static function");
    }

    void nonStaticFunction() {
        System.out.println("Hello world");
    }
}
