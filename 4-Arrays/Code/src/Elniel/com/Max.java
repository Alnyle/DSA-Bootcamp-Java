package Elniel.com;

public class Max {

    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int mx = arr[0];
        for (int  i = 0;  i < arr.length;  i++) {
            mx = Math.max(mx, arr[i]);
        }
        return mx;
    }
}
