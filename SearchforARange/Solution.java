package leetcode.searchforARange;

import org.junit.Test;

import com.hyace.test.TestLeetCode;

/**
 * Problem: Search for a Range
 * Description: Given a sorted array of integers, find the starting and ending
 * position of a given target value. Your algorithm’s runtime complexity must be
 * in the order of O(logn). If the target is not found in the array, return
 * [-1, -1].
 * For example, Given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4].
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public int[] searchRange(int[] A, int target) {
        int left = 0, right = A.length - 1, mid = 0;
        int[] res = new int[2];
        res[0] = res[1] = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (A[mid] < target) {
                if (mid + 1 < A.length && A[mid + 1] == target) break;
                left = mid + 1;
            } else right = mid - 1;
        }
        if (A[mid] == target) res[0] = res[1] = mid;
        else if (left > right) return res;
        else res[0] = mid + 1;
        left = 0;
        right = A.length - 1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (A[mid] > target) {
                if (mid > 0 && A[mid - 1] == target) break;
                right = mid - 1;
            } else left = mid + 1;
        }
        res[1] = mid - 1;
        if (A[mid] == target) res[1] = mid;
        return res;
    }

    @Test
    public void test() {
        // int[] a = { 5, 7, 7, 8, 8, 10 };
        int[] a = { 4, 5, 5, 5, 5, 5, 5, 5, 6, 7, 8 };
        TestLeetCode.printArray(searchRange(a, 5));
    }
}

/*
 * Submission Result: Wrong Answer
 * 
 * Input: [1], 1
 * Output: [-1,-1]
 * Expected: [0,0]
 */
