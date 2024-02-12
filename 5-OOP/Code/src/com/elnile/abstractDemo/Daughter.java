package com.elnile.abstractDemo;

public class Daughter extends Parent {

//    public Daughter(int age) {
//        this.age = age;
//    }

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be Coder");
    }

    @Override
    void partner() {
        System.out.println("I love learning languages");
    }
}
