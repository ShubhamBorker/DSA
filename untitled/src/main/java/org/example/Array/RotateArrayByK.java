package org.example.Array;

public class RotateArrayByK {

    public static void rotateArrayBykBrute(int[]num, int k){
        int n= num.length;
        k=k%n;
        for (int i=0;i<k;i++){
            int last= num[n-1];
            for(int j=n-1;j>0;j--){
                num[j]=num[j-1];
            }
            num[0]=last;
        }
    }

    public static void rotateArrayBykOpt(int[]num,int k){
        int n=num.length;
        k=k%n;

        reverse(num,0,n-1);
        reverse(num,0,k-1);
        reverse(num,k,n-1);

    }
    public static void reverse(int[]num,int start, int end){
        while (start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotateArrayBykOpt(arr, 3);
        System.out.println(java.util.Arrays.toString(arr)); // [5,6,7,1,2,3,4]
        int[] arr1={1,2,3,4,5,6,7,8,9};
        rotateArrayBykBrute(arr1, 2);
        System.out.println(java.util.Arrays.toString(arr1));
    }
}
