package com.Elnile.Singleton;

// Singleton class: is a class can only create one of object of it.
public class Singleton {
//    private int num = 0;
    private Singleton() {

    }

    private static Singleton instance;

    // create function return instance of Singleton class
    public static Singleton getInstance() {
        // check whether 1 obj created or not
        if(instance == null) {
            instance =  new Singleton();
        }
        return instance;
    }
}
