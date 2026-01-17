package org.example.Array;

public class SecondLargestElement {

    public static int findSecondLargest(int[]arr){
        int largest=Integer.MIN_VALUE;
        int SLargest=Integer.MIN_VALUE;

        if (arr.length<2){
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        for (int num : arr) {
            if (num > largest) {
                SLargest = largest;
                largest = num;
            } else if (num > SLargest && num != largest) {
                SLargest = num;
            }
        }
        if (SLargest==Integer.MIN_VALUE){
            System.out.println("No Second Largest ");
        }
        return SLargest;
    }

    public static void main(String [] args){
        int []arr={8,6,6,2,9,3,1};
        System.out.println("The Second Largest Number " + findSecondLargest(arr));
    }
}
