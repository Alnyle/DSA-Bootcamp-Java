package com.Elnile.access;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(12, "John Weak");
        System.out.println(obj.num);

    }
}
