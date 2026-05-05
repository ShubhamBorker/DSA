package org.example.Array;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1); // base case: sum=0 occurs once

        int prefixSum = 0, count = 0;

        for (int num : nums) {
            prefixSum += num;

            // Check if (prefixSum - k) exists
            if (prefixMap.containsKey(prefixSum - k)) {
                count += prefixMap.get(prefixSum - k);
            }

            // Update prefix sum frequency
            prefixMap.put(prefixSum, prefixMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println("Count of subarrays = " + subarraySum(nums, k));
    }

}
