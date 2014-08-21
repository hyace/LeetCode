package leetcode.firstMissingPositive;

import org.junit.Test;

/**
 * Problem: First Missing Positive
 * Description: Given an unsorted integer array, find the first missing positive
 * integer. For example, Given [1,2,0] return 3, and [3,4,-1,1] return 2. Your
 * algorithm should run in O(n) time and uses constant space.
 * 
 * Date: Aug 21, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    /**
     * Bucket Sort
     * 
     * @param A
     * @return
     */
    public int firstMissingPositive(int[] A) {
        int i = 0;
        int n = A.length;
        for (; i < n; i++) {
            if (A[i] != i + 1 && A[i] > 0 && A[i] < n + 1) {
                int t = A[i];
                A[i] = A[t - 1];
                A[t - 1] = t;
                i--;
            }
        }
        for (i = 0; i < n; i++)
            if (A[i] != i + 1) break;
        return i + 1;
    }

    @Test
    public void test() {
        int[] a = { 8, 3, 6, 2, 7, -1, 1, 5 };
        System.out.println(firstMissingPositive(a));
    }
}
