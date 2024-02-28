package com.Elniel;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        int[] arr2 = {-4, 2, 1, 5, 0};
//        insertion(arr);
        selection(arr2);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }

    static void selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1; // last unordered item index from the right
            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }



    static void insertion(int[] arr) {
                            // i < arr.length - 2 => if i = 4 and j = 5 (out of the bound)
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i+1;j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
                else
                    break;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}