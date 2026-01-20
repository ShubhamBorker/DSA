package org.example.Array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int SingleNumberBrute(int[]arr){
        Map<Integer,Integer> freq = new HashMap<>();

        for (int num:arr){
            freq.put(num, freq.getOrDefault(num,0) +1);
        }
        for (int num:arr){
            if (freq.get(num)==1) return num;
        }
        return -1;
    }

    public static int SingleNumberOpt(int [] arr){
        int result=0;
        for (int num:arr){
            result^=num;
        }
        return result;
    }

    public static void main(String[]args){
        int[]arr={1 ,2 , 2, 3, 5, 4, 5, 3, 4};
        int[]arr1={2, 3, 5, 4, 5, 3, 4};

        System.out.println("Single number (Brute Force): " + SingleNumberBrute(arr));
        System.out.println("Single number (Optimized): " + SingleNumberOpt(arr1));
    }
}
