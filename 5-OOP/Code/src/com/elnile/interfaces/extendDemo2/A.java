package com.elnile.interfaces.extendDemo2;

public interface A {

    // static interface methods should always have a body
    // call vai interface name
    static void greeting() {
        System.out.println("Hey I am static method");
    }
    default void fun() {
        System.out.println("Hello I am default method");
    }
}
