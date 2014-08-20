package leetcode.mergeSortedArray;

import org.junit.Test;

import com.hyace.test.TestLeetCode;

/**
 * Problem: Merge Sorted Array
 * Description: Given two sorted integer arrays A and B,
 * merge B into A as one sorted array.
 * Note: You may assume that A has enough space to
 * hold additional elements from B. The number of
 * elements initialized in A and B are m and n respectively.
 * Date: July 18 , 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int t = A.length - 1, p = m - 1, q = n - 1;
        while (p >= 0 && q >= 0) {
            if (A[p] >= B[q]) A[t--] = A[p--];
            else A[t--] = B[q--];
        }
        while (p >= 0)
            A[t--] = A[p--];
        while (q >= 0)
            A[t--] = B[q--];
    }

    @Test
    public void test() {
        int[] a = { 0, 1, 2, 3, 4, 6, 8, 9, 0, 0, 0, 0, 0, 0 };
        int[] b = { 2, 4, 7, 8, 13, 20 };
        merge(a, 8, b, 6);
        TestLeetCode.printArray(a);
    }
}
