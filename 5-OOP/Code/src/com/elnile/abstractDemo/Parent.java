package com.elnile.abstractDemo;

public abstract class Parent {

    int age;

    final int VALUE;

    public Parent(int age){
        this.age = age;
        VALUE = 5345322;
    }

    // abstract class can have static method
    static void hello(){
        System.out.println("hi");
    }

    // abstract class can have normal methods
    void normal(){
        System.out.println("This non-static method");
    }

    // abstract method => (virtual pure in c++) function: Function does have implementation in Base Class
    // but have implementation in derived class
    abstract void  career();
    abstract void partner();
}
