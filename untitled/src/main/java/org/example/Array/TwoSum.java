package org.example.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumBrute(int[]num , int target){

        if (num == null) {
            throw new IllegalArgumentException("Input array must not be null");
        }
        if (num.length < 2) {
            throw new IllegalArgumentException("At least two numbers are required");
        }

        for(int i =0; i<num.length;i++){
            for (int j=i+1;j< num.length;j++){
                if(num[i] + num[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSumOpt(int[] num, int target){

        if (num == null) {
            throw new IllegalArgumentException("Input array must not be null");
        }
        if (num.length < 2) {
            throw new IllegalArgumentException("At least two numbers are required");
        }

        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i< num.length;i++){
            int rem =target-num[i];
            if (map.containsKey(rem)){
                return new int[] {map.get(rem),i};
            }
            map.put(num[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[]args){
        int []num={2, 7, 11, 15};
        int target = 9;

        int[] result1 =twoSumBrute(num,target);
        int[] result2 =twoSumOpt(num,target);
        System.out.println("Brute Force Result: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("Optimized Result: [" + result2[0] + ", " + result2[1] + "]");
    }
}
