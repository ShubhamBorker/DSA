package org.example.Array;

public class RangeSumArray {

    private final int []prefixSum;

    public RangeSumArray(int[] nums) {
        prefixSum = new int[nums.length+1];
        prefixSum[0]=0;
        for (int i=0;i< nums.length;i++){
        prefixSum[i+1]=prefixSum[i] +nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right+1]-prefixSum[left];
    }

    public static void main(String[]args){
        int[] nums = {1, 2, 3, 4, 5};
        RangeSumArray obj = new RangeSumArray(nums);

        // Example queries
        System.out.println("Sum from 0 to 2: " + obj.sumRange(0, 2)); // 1+2+3 = 6
        System.out.println("Sum from 1 to 3: " + obj.sumRange(1, 3)); // 2+3+4 = 9
        System.out.println("Sum from 2 to 4: " + obj.sumRange(2, 4)); // 3+4+5 = 12
    }
}
