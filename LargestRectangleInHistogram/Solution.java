package leetcode.largestRectangleInHistogram;

import java.util.Arrays;
import java.util.Stack;

import org.junit.Test;

/**
 * Problem: Largest Rectangle in Histogram
 * Description: Given n non-negative integers representing the histogram’s bar
 * height where the width of each bar is 1, find the area of largest rectangle
 * in the histogram.
 * For example, Given height = [2,1,5,6,2,3], return 10.
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public int largestRectangleArea(int[] height) {
        int N = height.length;
        if (N == 0) return 0;
        height = Arrays.copyOf(height, N + 1);
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0, res = 0;
        while (i < N + 1) {
            if (stack.empty() || height[stack.peek()] <= height[i]) stack
                    .push(i++);
            else {
                int index = stack.pop();
                int width = stack.empty() ? i : i - stack.peek() - 1;
                res = Math.max(res, height[index] * width);
            }
        }
        return res;
    }

    @Test
    public void test() {
        int[] a = { 2, 1, 5, 6, 2, 3 };
        System.out.println(largestRectangleArea(a));
    }
}
