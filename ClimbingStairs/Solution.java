package leetcode.climbingStairs;

/**
 * Problem: Climbing Stairs
 * Description: You are climbing a stair case. It takes n steps to reach to the
 * top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * Date: July 30, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public int climbStairs(int n) {
        int pre = 1, next = 2;
        if (n == 1) return pre;
        else if (n == 2) return next;
        for (int i = 2; i < n; i++) {
            int temp = next;
            next += pre;
            pre = temp;
        }
        return next;
    }
}
