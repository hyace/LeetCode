package leetcode.trappingRainWater;

/**
 * Problem: Trapping Rain Water
 * Description: Given n non-negative integers representing an elevation
 * map where the width of each bar is 1, compute how much water it is
 * able to trap after raining.
 * For example, Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * 
 * @author Chyace
 *         Date: July 29, 2014
 * 
 */
public class Solution {
    public int trap(int[] A) {
        int N = A.length;
        int[] left = new int[N], right = new int[N];
        int max = A[0];
        left[0] = right[N - 1] = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > max) max = A[i];
            left[i] = max;
        }
        max = A[N - 1];
        for (int i = N - 1; i >= 0; i--) {
            if (A[i] > max) max = A[i];
            right[i] = max;
        }
        int sum = 0;
        for (int i = 0; i < N; i++)
            sum += Math.min(left[i], right[i]) - A[i];
        return sum;
    }
}
