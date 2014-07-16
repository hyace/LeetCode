package leetcode.searchInRotatedSortedArray;

/**
 * Problem: Search in Rotated Sorted Array Description: Suppose a sorted array
 * is rotated at some pivot unknown to you beforehand. (i.e., 0 1 2 4 5 6 7
 * might become 4 5 6 7 0 1 2). You are given a target value to search. If found
 * in the array return its index, otherwise return -1. You may assume no
 * duplicate exists in the array
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public static int search(int[] A, int target) {
        int left = 0, right = A.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == A[mid])
                return mid;
            if (A[mid] > A[left]) {
                if (target < A[mid] && target >= A[left])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (target > A[mid] && target <= A[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }
	// 一下是解决II的search，running time 是O(n),也可以解决I，oj通过，但是效率略低
    public int searchII(int[] A, int target) {
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
