package Elniel.com;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // number of rows in require but number of columns is not require
        int[][] matrix = new int[3][];

        matrix = new int[][]{
                {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        };

        System.out.println(Arrays.toString(matrix[0])); // => [1, 2, 3]
        System.out.println();

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();

        int[][] arr = new int[2][2];

        // arr.length => number of rows
        // arr[0].length => number of columns

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }


//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        // better way
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // another way
        for (int[] a : arr) {
            for (int e : a) {
                System.out.print(e + " ");
            }
        }




    }
}
