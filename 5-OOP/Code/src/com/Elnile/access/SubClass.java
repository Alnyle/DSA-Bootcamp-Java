package com.Elnile.access;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(12, "John Weak");
        System.out.println(obj.num);


        // instanceof: to check if object instance of class
        System.out.println(obj instanceof A);
        System.out.println(obj instanceof Object);

        // get information about class
        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());
        System.out.println(obj.getClass().arrayType());

    }
}
