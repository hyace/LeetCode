package leetcode.threeSumClosest;

import java.util.Arrays;

/**
 * Problem: 3Sum Closest
 * Description: Given an array S of n integers, find three integers
 * in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers. You may assume that
 * each input would have exactly one solution.For example, given
 * array S = {-1 2 1 -4}, and target = 1. The sum that is closest to
 * the target is 2. (-1 + 2 + 1 = 2).
 * Date: July 19 , 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < num.length - 2; i++) {
            int l = i + 1, r = num.length - 1;
            while (l < r) {
                int sum = num[i] + num[l] + num[r];
                if (sum == target) return target;
                if (sum > target) r--;
                else l++;
                //这里如果不判断MAX，abs会计算出一个MIN
                if (result == Integer.MAX_VALUE || Math.abs(sum - target) < Math.abs(result - target))
                    result = sum;
            }
        }
        return result;
    }
}
