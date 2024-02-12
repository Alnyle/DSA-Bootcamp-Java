package com.elnile.staticExample;

public class Static {

    public static void main(String[] args) {

        staticFunction();

        // static (classes, functions, variable..) will resolve during compile time

        // 1- why every function we call inside main function have to be static
        // because main function is static

        // 2- this function will give you error?
        // because you can not call non-static function inside static function
//        nonStaticFunction();
    }

    // this is not dependent on objects
    static void staticFunction() {

        // nonStaticFunction(); // you can not use this because it requires an instance
        //but the function you are using it in does not depend on instance


        // you can not access non-static stuff without reference their instance
        // in static context

        // here I am reference it
        Static obj = new Static();
        obj.nonStaticFunction();

        System.out.println("Hello from static function");
    }

    // we know that something which is not static, belong to an object
    void nonStaticFunction() {
        System.out.println("Hello world");
    }
}
