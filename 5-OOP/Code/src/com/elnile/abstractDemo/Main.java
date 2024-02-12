package com.elnile.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(23);
        daughter.career();

        // can not create object of abstract class
//        Parent parent = new Parent(21); // error
        Parent.hello();



    }
}
