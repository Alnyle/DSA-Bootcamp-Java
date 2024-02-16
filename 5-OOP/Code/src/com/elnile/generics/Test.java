package com.elnile.generics;

import java.util.Arrays;

// here T should either be a Number or subclasses
public class Test<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public Test() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T item) {

        if (this.isFull()) {
            this.resize();
        }
        this.data[size++] = item;
    }


    private void resize() {

        Object[] dummy = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            dummy[i] = data[i];
        }
        data = dummy;
    }

    private boolean isFull() {
        return size >= data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T remove() {
//
//        if(this.isEmpty()) {
//            return (T)"";
//        }
        T removedItem = (T)this.data[--this.size];
        return removedItem;
    }

    public T get(int index) {
//        if (this.isEmpty()) {
//            return (T);
//        }
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {

        if (index < 0 || index >= data.length) {
            System.out.println("Index out of range: " + index);
            return;
        }

        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        Test<Integer> list = new Test<>();
        list.add(42);
        list.add(43);
        list.add(41);
        System.out.println(list.get(0));
        System.out.println(list.remove());
        System.out.println(list);
        for (int i = 0; i < 12; i++) {
            list.add(2 * i);
        }
        System.out.println(list);
    }
}
