package com.elnile.cloning;


// Cloneable: tells the JVM this Object will be cloned
public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 9};
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        // this is shallow copying
//        return super.clone(); // because clone function in the interface throw an exception
//    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        // this is deep copying
        Human twin = (Human)super.clone(); // this actually shallow copy

        // make a deep copy
        twin.arr = new int[this.arr.length];

        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
}
