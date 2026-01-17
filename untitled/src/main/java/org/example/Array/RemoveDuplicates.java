package org.example.Array;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static int removeDuplicatesBrute(int []arr){
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int i = 0;
        for (int num : set) {
            arr[i++] = num;
        }
        return i; // new length
    }

    public static int removeDuplicatesOptimized(int[] arr){
        int i=0;
        for (int j=1;j< arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,4,4,5};
        int newLength = removeDuplicatesBrute(arr);

        System.out.println("Array after removing duplicates(Brute): ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] arr2 = {1,1,2,2,3,4,4,5};
        int newLength1 = removeDuplicatesOptimized(arr2);

        System.out.println("Array after removing duplicates(Optimized): ");
        for (int i = 0; i < newLength1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
