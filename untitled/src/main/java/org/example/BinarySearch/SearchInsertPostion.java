package org.example.BinarySearch;

public class SearchInsertPostion {

    public static int searchInstPostBrute(int[]nums, int target){
        for (int i=0;i< nums.length;i++){
            if (nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    public static int searchInstPostOpt(int[]nums, int target){
        int left=0; int right= nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if (nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return left;
    }

    public static void main(String[]args){
        int[]arr={1,3,5,6};

        System.out.println("Search Insert Position(Brute) "+searchInstPostBrute(arr,2));
        System.out.println("Search Insert Position(Optimized) "+ searchInstPostOpt(arr,3));
        System.out.println("Search Insert Position(Brute) "+ searchInstPostBrute(arr,5));
        System.out.println("Search Insert Position(Optimized) "+ searchInstPostOpt(arr,2));
    }
}
