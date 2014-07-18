package leetcode.medianOfTwoSortedArrays;

/**
 * Problem: Median of Two Sorted Arrays
 * Description: There are two sorted arrays A
 * and B of size m and n respectively. Find
 * the median of the two sorted arrays. The
 * overall run time complexity should be
 * O(log(m + n)).
 * 
 * author Hyace date:July 16, 2014
 * 
 */
// C++的实现传递的是数组指针，直接加整型就可以移动，Java版需要重构
public class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length, n = B.length;
        if (((m + n) & 1) == 1)
            return findKthSortedArrays(A, 0, B, 0, (m + n) / 2 + 1);
        else
            return (findKthSortedArrays(A, 0, B, 0, (m + n) / 2) + findKthSortedArrays(
                    A, 0, B, 0, (m + n) / 2 + 1)) / 2;
    }

    private double findKthSortedArrays(int[] A, int m, int[] B, int n, int k) {
        int da = A.length - m, db = B.length - n;
        if (da > db) return findKthSortedArrays(B, n, A, m, k);
        if (da == 0) return B[n + k - 1];
        if (k == 1) return Math.min(A[m], B[n]);

        int i = Math.min(k / 2, da);
        int j = k - i;
        int a = A[m + i - 1];
        int b = B[n + j - 1];
        if (a < b) return findKthSortedArrays(A, m + i, B, n, j);
        if (b < a) return findKthSortedArrays(A, m, B, n + j, i);
        return a;
    }
}
