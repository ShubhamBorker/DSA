package org.example.Array;

public class MissingNumber {
    public static int MissingNoBrute(int[]arr, int n){
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) return i;
        }
        return -1; // should not happen

    }

    public static int MissingNooptimized(int[]arr, int n){
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1; // expected range size
        System.out.println("Missing number (Brute): " + MissingNoBrute(arr, n));

            int[] arr1 = {1, 2, 4, 5, 6};
            int n1 = arr1.length + 1; // expected range size
            System.out.println("Missing number (Sum Formula): " + MissingNooptimized(arr1, n1));

    }

}
