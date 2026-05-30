package org.example.BinarySearch;

public class FindMinRotatedSorted {
    public static int findMinRotatedSortedBrute(int[]nums){
        int min=nums[0];
        for (int num:nums){
            if (num<min){
                min=num;
            }
        }
        return min;
    }

    public static int findMinRotatedSortedOpt(int[]nums){
        int left=0; int right= nums.length-1;

        while(left<right){
            int mid=left+(right-left)/2;
            if (nums[mid]>nums[right]){
                left=mid+1;
            }else {
                right=mid;
            }
        }
        return nums[left];
    }

    public static void main(String[]args){
        int[]arr={4,5,6,7,0,1,2};

        System.out.println("Find MInimun in Rotated Sorted Array(Brute): "+ findMinRotatedSortedBrute(arr));
        System.out.println("Find MInimun in Rotated Sorted Array(Optimized): "+ findMinRotatedSortedOpt(arr));
    }
}
