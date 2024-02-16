package com.elnile.interfaces.extendDemo2;

public class Main implements A,B {
    @Override
    public void fun() {
        A.super.fun();
    }

    @Override
    public void greeting() {

    }

    public static void main(String[] args) {
        Main main = new Main();
        A.greeting();
    }

}
