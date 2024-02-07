package Elniel.com;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        change(nums);
        System.out.println(nums[0]);
        // Arrays are mutable in java
        // String are immutable in java
    }

    static void change(int[] arr) {
        arr[0] = 1000;
    }
}
