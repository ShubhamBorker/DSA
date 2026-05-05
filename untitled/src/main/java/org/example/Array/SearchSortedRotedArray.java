package org.example.Array;

public class SearchSortedRotedArray {

    public static int search(int[]arr, int target){
        int left =0, right=arr.length-1;

        while (left<=right){
            int mid= left +(right-left)/2;

            if (arr[mid]==target) return mid;

            //Left half sorted
            if(arr[left]<=arr[mid]){
                if(target>=arr[left] && target<arr[mid]){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
                //Right half sorted
            }else {
                if (target>arr[mid] && target<=arr[right]){
                    left=mid+1;
                }else {
                    right=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[]args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 2;
        System.out.println("Index of target = " + search(nums, target));
    }
}
