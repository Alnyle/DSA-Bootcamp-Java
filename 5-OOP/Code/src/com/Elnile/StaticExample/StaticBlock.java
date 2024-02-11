package com.Elnile.StaticExample;

// this is a demo to show initialisation of static variables
public class StaticBlock {
    // when class is loaded all static elements are run first

    static int a = 5;
    static int b;

    // static block: will only run once, when first obj is create i.e. when the class is loaded for first time
    static {
        System.out.println("Hello I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
//        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

//        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
