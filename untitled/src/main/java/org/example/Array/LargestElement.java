package org.example.Array;

public class LargestElement {
    public static int findLargestElement(int [] arr){
        int max = arr[0];

        for (int i=0; i< arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[]args){
        int [] arr={3,1,9,5,0,4};
        System.out.println("Largest Element in array " + findLargestElement(arr));
    }
}
