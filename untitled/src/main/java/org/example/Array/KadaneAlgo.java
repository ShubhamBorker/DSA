package org.example.Array;

public class KadaneAlgo {

    public static int maxSubArr(int[] num){
      int currSum= num[0];
      int maxSum= num[0];

      for(int i =1; i<num.length; i++){
          currSum= Math.max(num[i], currSum+num[i]);
          maxSum=Math.max(maxSum,currSum);
      }
      return  maxSum;
    }

    public static void main(String[]args){
        int[]num={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("MaxSubArray "+ maxSubArr(num));
    }
}
