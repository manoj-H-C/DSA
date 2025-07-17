package Arrays_coding_exercise;

import java.util.Arrays;

public class BuyAndSellStock {
    /*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different
 day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.*/

    public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int value : prices){
            if(value<min){
                min = value;
            } else if (value-min > max) {
                max = value - min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(BuyAndSellStock.maxProfit(prices));
    }
}
