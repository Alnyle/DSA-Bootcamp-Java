package com.Elnile.access;

public class ObjectDemo {

    int num;
    float grade;

    public ObjectDemo(int num, float grade) {
        this.num = num;
        this.grade = grade;
    }

    // give a number representation of object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // called after garbage collection from memory object
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {

        ObjectDemo obj1 = new ObjectDemo(21, 2.9f);
        ObjectDemo obj2 = new ObjectDemo(21, 2.9f);
        System.out.println(obj1.hashCode());

        // check the both reference variable reference obj or not => check address
        if (obj1 == obj2) {
            System.out.println("Obj1 is equal obj2");
        }

        // check the both object value => check values
        if (obj1.equals(obj2)) {
            System.out.println("Obj1 is equal obj2 from function");
        }
    }
}
