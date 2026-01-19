package org.example.Array;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] arr) {
        int count = 0, maxCount = 0;

        for (int num : arr) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0; // reset streak
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 4,1,1,1, 1};
        System.out.println("Max consecutive ones: " + findMaxConsecutiveOnes(arr));
    }

}
