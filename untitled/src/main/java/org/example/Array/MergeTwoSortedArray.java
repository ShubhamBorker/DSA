package org.example.Array;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static int[] mergeBrute(int[]arr1,int[]arr2){
        int n=arr1.length;
        int m=arr2.length;
        int[]merged=new int[m+n];

        System.arraycopy(arr1,0,merged,0,n);
        System.arraycopy(arr2,0,merged,n,m);

        Arrays.sort(merged);
        return merged;
    }

    public static int[] mergeOpt(int[]arr1,int[]arr2){
        int n=arr1.length;
        int m=arr2.length;
        int[]merged=new int[m+n];
        int i=0; int j=0; int k=0;

        while (i<n && j<m){
            if (arr1[i]<=arr2[j]){
                merged[k++]=arr1[i++];
            }else {
                merged[k++]=arr2[j++];
            }
        }
        while (i < n) merged[k++] = arr1[i++];
        while (j < m) merged[k++] = arr2[j++];

        return merged;
    }

    public static void mergeInPlace(int[] nums1, int m, int[] nums2, int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 &&j>=0){
            if (nums1[i]>=nums2[j]){
                nums1[k--]= nums1[i--];
            } else {
                nums1[k--]=nums2[j--];
            }
        }
        while (j>=0){
            nums1[k--]=nums2[j--];
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};

        System.out.println(Arrays.toString(mergeBrute(arr1, arr2))); // [1,2,3,4,5,6]
        System.out.println(Arrays.toString(mergeOpt(arr1,arr2)));

        mergeInPlace(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
