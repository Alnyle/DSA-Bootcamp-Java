package com.Elniel;

import java.util.Arrays;

public class PythagoreanTriplet {
    /*
        Input:
        N = 5
        Arr[] = {3, 2, 4, 6, 5}
        Output: Yes
        Explanation: a=3, b=4, and c=5 forms a
        pythagorean triplet

        1 <= n <= 10^5
        1 <= arr[i] <= 1000

     */
    public static void main(String[] args) {
        int[] test3 = {14, 17, 4, 4, 1, 9, 25, 12, 4, 9, 18, 15, 12, 2, 3, 13, 16, 17, 15, 6, 5, 20, 14, 8};
        int[] test2 = {3, 8, 5};

        boolean ans = checkTriplet(test3, 24);
        System.out.println(ans);

        boolean ans2 = checkTriplet(test2, 3);
        System.out.println(ans2);
        System.out.println(checkTriplet(new int[]{3, 2, 4, 6, 5}, 5));
    }

    static boolean checkTriplet(int[] arr, int n) {
        /*
         not the optimal solution but you can optimize the solution using hash Table
        */
        for (int i = 0; i < n; i++)
            arr[i] *= arr[i];

        // sort array elements
        Arrays.sort(arr);

        for (int i = n - 1; i > 2; i--) {

            int left = 0;
            int right = i - 1;

            while(left < right) {

                if (arr[left] + arr[right] == arr[i])
                    return true;

                if (arr[left] + arr[right] < arr[i]) left++;
                else right--;
            }
        }

        return false;

    }
}
