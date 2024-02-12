package com.elnile.staticExample;


class Test {
    static String name;
    public Test(String name) {
        this.name = name;
    }
}

// inner classes: are allow it in java
public class InnerClasses {

//    // only inner classes can be static
//    static class Test {
//        String name;
//
//        public Test(String name) {
//            this.name = name;
//        }
//    }

    public static void main(String[] args) {
        Test a = new Test("Ahmed");
        Test b = new Test("John");

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(b);
    }
}

// out side can be static because it's self depend it
//static class A {
//
//}
