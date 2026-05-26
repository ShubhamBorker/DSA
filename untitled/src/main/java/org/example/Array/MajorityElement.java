package org.example.Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElementBrute(int[]arr){
        int n=arr.length;
        Map<Integer,Integer>map=new HashMap<>();
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
            if (map.get(num)>n/2){
                return num;
            }
        }
        return -1;
    }

    public static int majorityElementOpt(int[]arr){
        int count=0;
        int cand=arr[0];

        for(int num:arr){
            if (count==0){
                cand=num;
                count=1;
            } else if (num==cand) {
                count++;
            }else {
                count--;
            }
        }return cand;
    }

    public static void main(String[]args){
        int[]arr={3,3,4,2,3,3,5};
        System.out.println("Majority element from Brute "+ majorityElementBrute(arr));
        System.out.println("Majority element from Opt "+ majorityElementOpt(arr));
    }
}
