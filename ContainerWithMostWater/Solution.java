package leetcode.containerWithMostWater;

import org.junit.Test;

/**
 * Problem: Container With Most Water
 * Description: Given n non-negative integers a 1 ,a 2 ,...,a n , where each
 * represents a point at coordinate (i,a i ). n vertical lines are drawn such
 * that the two endpoints of line i is at (i,a i ) and (i,0). Find two lines,
 * which together with x-axis forms a container, such that the container
 * contains the most water.
 * Note: You may not slant the container.
 * Date: Aug 9, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public int maxArea(int[] height) {
        int max = 0, left = 0, right = height.length - 1;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(max, area);
            if (height[left] <= height[right]) left++;
            else right++;
        }
        return max;
    }

    @Test
    public void test() {
        int[] h = { 1, 2, 3, 4 };
        System.out.println(maxArea(h));
    }
}
