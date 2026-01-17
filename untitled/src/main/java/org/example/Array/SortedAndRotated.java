package org.example.Array;

public class SortedAndRotated {

    public static boolean isSortedAndRotated(int[]arr){
        int n = arr.length;
        int count=0;
        for (int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }

        if(arr[n-1]>arr[0]){
            count++;
        }
        return count==1;
    }

    public static void main(String[]args){
        int[] arr={3, 4, 5, 1, 2};
        int[] arr2={1, 2, 3, 4, 5};
        int[] arr3={3, 5, 4, 1, 2};

        System.out.println("The array is sorted and rotated? " + isSortedAndRotated(arr));
        System.out.println("The array is sorted and rotated? " + isSortedAndRotated(arr2));
        System.out.println("The array is sorted and rotated? " + isSortedAndRotated(arr3));
    }
}
