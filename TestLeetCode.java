package com.hyace.test;

import leetcode.searchInRotatedSortedArray.Solution;

//import leetcode.removeDuplicatesFromSortedArrayII.Solution;

//import leetcode.removeDuplicatesFromSortedArray.Solution;

//import leetcode.simplenumber.Solution;

//import leetcode.twosum.Solution;

import org.junit.Test;

public class TestLeetCode {
    @Test
    public void test() {
        // SimpleNumber
        // int[] a = { 2, 4, 2, 4, 1, 6, 1, 7, 7, 3, 3, 9, 9, 44, 44, 6, 11, 5,
        // 5 };
        // Solution s = new Solution();
        // System.out.println(s.singleNumber(a));

        // TwoSum
        // int[] a = { 1, 2, 5, 6, 8, 10, 11, 12, 15 };
        // Solution s = new Solution();
        // int[] r = s.twoSum(a, 15);
        // System.out.println(r[0] + ":" + a[r[0] - 1] + "," + r[1] + ":" +
        // a[r[1] - 1]);
        // Remove Duplicates
        // int[] a = { 2, 1, 1, 1, 9, 7, 7, 4, 2, 4, 1, 6, 1, 7, 7, 3, 3, 9, 9,
        // 44, 44, 6, 11, 5, 5 };
        // printArray(a);
        // Arrays.sort(a);
        // printArray(a);
        // int n = Solution.removeDuplicates(a);
        // System.out.println(n + " : ");
        // printArray(a);
        // Search
        int[] a = { 5, 6, 7, 8, 9, 10, 11, 0, 1, 2, 3, 4 };
        System.out.println(Solution.search(a, 4));

    }

    private void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
