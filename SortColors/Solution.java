package leetcode.sortColors;

import org.junit.Test;

import com.hyace.test.TestLeetCode;

/**
 * Problem: Sort Colors
 * Description: Given an array with n objects colored red, white or blue, sort
 * them so that objects of the same color are adjacent, with the colors in the
 * order red, white and blue. Here, we will use the integers 0, 1, and 2 to
 * represent the color red, white, and blue respectively.
 * Note: You are not suppose to use the library’s sort function for this
 * problem.
 * Follow up:
 * A rather straight forward solution is a two-pass algorithm using counting
 * sort.
 * 
 * First, iterate the array counting number of 0’s, 1’s, and 2’s, then overwrite
 * array with total number of 0’s, then 1’s and followed by 2’s. Could you come
 * up with an one-pass algorithm using only constant space?
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public void sortColors(int[] A) {
        int left = 0, right = A.length - 1, p = left;
        while (p <= right) {
            if (A[p] > 1) exch(A, p, right--);
            else if (A[p] < 1) exch(A, left++, p++);
            else p++;
        }
    }

    private void exch(int[] a, int p, int i) {
        int t = a[p];
        a[p] = a[i];
        a[i] = t;
    }

    @Test
    public void test() {
        // int[] a = { 1, 2, 0, 1, 2, 1, 0, 0, 2, 1, 2, 2, 0, 2, 1, 0, 1 };
        int[] a = { 1, 0 };
        sortColors(a);
        TestLeetCode.printArray(a);
    }
}