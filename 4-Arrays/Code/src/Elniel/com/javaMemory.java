package Elniel.com;

import java.util.Arrays;

public class javaMemory {
    public static void main(String[] args) {

        /*
        primitive in java store in stack
        non-primitive store in heap (Strings, arrays,..etc)
         */

        int[] arr = new int[5];
        // full array using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // another to print array using stringBuilder => best one
        System.out.println('\n' + "Using stringBuilder \n" + Arrays.toString(arr));


        System.out.println();
        // for each loop
        for (int e : arr) {
            System.out.print(e + " ");
        }



    }
}
