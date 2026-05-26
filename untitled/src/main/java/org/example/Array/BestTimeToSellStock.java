package org.example.Array;

public class BestTimeToSellStock {

    public static int maxProfit(int[] prices){
      int minprice=Integer.MAX_VALUE;
      int maxprofit=0;

      for(int price:prices){
          if(price<minprice){
              minprice=price;
          }else {
              maxprofit=Math.max(maxprofit,price-minprice);
          }
      }
      return maxprofit;
    }

    public static void main(String[]args){
        int[] prices={7,1,2,5,6,4};

        System.out.println("Maximum Profit will be on day "+ maxProfit(prices));
    }
}
