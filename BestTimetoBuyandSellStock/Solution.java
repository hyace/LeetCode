package leetcode.bestTimetoBuyandSellStock;

/**
 * Problem: Best Time to Buy and Sell Stock
 * Description: Say you have an array for which the ith element is the price of
 * a given stock on day i.
 * 
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 * Date: Aug 9, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int min = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}
