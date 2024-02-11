package com.Elnile.Singleton;

public class Main {
    public static void main(String[] args) {

        // all these three reference variables are pointing reference one obj (same obj)
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
    }
}
