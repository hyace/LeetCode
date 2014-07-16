package leetcode.searchInRotatedSortedArrayII;

/**
 * Problem: Search in Rotated Sorted Array II Description: Follow up for ”Search
 * in Rotated Sorted Array”: What if duplicates are allowed?Would this affect
 * the run-time complexi ty? How and why?Write a function to determine if a
 * given target is in the array.
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public static int search(int[] A, int target) {
        int n = A.length;
        int p = n - 1;
        for (int i = 1; i < n; i++, p--)
            if (A[i] < A[i - 1])
                break;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int t = (mid - p + n) % n;
            if (A[t] == target)
                return t;
            if (A[t] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
