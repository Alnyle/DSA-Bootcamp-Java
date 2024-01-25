package com.Elniel;

import java.util.Arrays;

public class ChangeValue {

    public static void main(String[] args) {
        // in Java object: we pass value of that reference variable
        int[] arr = {1, 3, 4, 71};
        change(arr);
        // convert an int array it to string and print it
        System.out.println(Arrays.toString(arr)); // Output: 100, 3, 4, 71

    }

    static void change(int[] nums) {
        nums[0] = 100; // if you make a change to the object via this ref variable, same object will be change
    }
}
