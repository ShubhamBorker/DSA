package org.example.Array;

public class MoveZerosEnd {

    public static void moveTozeroBrute(int []arr){
        int n =arr.length;
        int[] temp=new int[n];
        int index=0;

        // Copy non-zero elements
        for(int num:arr){
            if(num!=0){
                temp[index++]=num;
            }
        }
        // Fill remaining with zeros
        while(index<n){
            temp[index++]=0;
        }
        // Copy back
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void moveToZeroOptimized(int [] arr){
        int j = 0; // pointer for non-zero position

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap non-zero with position j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveTozeroBrute(arr);
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        int[] arr1={5,2,0,6,0,9};
        moveToZeroOptimized(arr1);
        for (int num : arr1) System.out.print(num + " ");
    }

}
