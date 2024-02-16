package com.elnile.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int item) {

        if (this.isFull()) {
            this.resize();
        }
        this.data[size++] = item;
    }


    private void resize() {

        int[] dummy = new int[data.length * 2];

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

    public int remove() {

        if(this.isEmpty()) {
            return 0;
        }
        int removedItem = this.data[--this.size];
        return removedItem;
    }

    public int get(int index) {
        if (this.isEmpty()) {
            return 0;
        }
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {

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

        CustomArrayList list = new CustomArrayList();
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
