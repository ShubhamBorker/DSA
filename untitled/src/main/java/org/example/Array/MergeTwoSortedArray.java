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

    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        System.out.println(Arrays.toString(mergeBrute(arr1, arr2))); // [1,2,3,4,5,6]
        System.out.println(Arrays.toString(mergeOpt(arr1,arr2)));
    }
}
