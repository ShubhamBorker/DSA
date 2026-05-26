package org.example.Array;

public class ProductOfAnArray {

    public static int[] productExceptSelfBrute(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        for(int i = 0; i < n; i++) {
            int pro = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                pro *= nums[j];
            }
            ans[i] = pro;
        }

        return ans;
    }

    public static int[] productExceptSelfOpt(int[] nums) {
        int n=nums.length;
        int pre[]= new int[n];
        int suf[]= new int[n];
        pre[0]=1;
        suf[n-1]=1;

        for(int i=1;i<n;i++){
            pre[i]=pre[i-1] * nums[i-1];
        }
        for(int j=n-2;j>=0;j--){
            suf[j]=suf[j+1]*nums[j+1];
        }
        int ans[] =new int[n];
        for(int i=0;i<n;i++){
            ans[i]= pre[i] * suf[i];
        }
        return ans;
    }



    public static void main(String[]args){
        int[]arr={1,2,3,4};
        System.out.println("Product Of An Array Except Self(Brute): "+ productExceptSelfBrute(arr));
        System.out.println("Product of An Array Except Self(Opt): "+ productExceptSelfOpt(arr));
    }
}
