package leetcode.bestTimetoBuyandSellStockII;

import org.junit.Test;

/**
 * Problem: Best Time to Buy and Sell Stock II
 * Description: Say you have an array for which the i-th element is the price of
 * a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many
 * transactions as you like (ie, buy one and sell one share of the stock
 * multiple times ). However, you may not engage in multiple transactions at the
 * same time (ie, you must sell the stock before you buy again).
 * Date: Aug 9, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int cur = Math.max(0, prices[i] - prices[i - 1]);
            profit += cur;
        }
        return profit;
    }

    @Test
    public void test() {
        int[] prices = { 3, 2, 4, 1, 2 };
        System.out.println(maxProfit(prices));
    }
}
