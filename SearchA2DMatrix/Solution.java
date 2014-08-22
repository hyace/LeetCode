package leetcode.searchA2DMatrix;

import org.junit.Test;

/**
 * Problem: Search a 2D Matrix
 * Description: Write an efficient algorithm that searches for a value in an m×n
 * matrix. This matrix has the following properties:
 * • Integers in each row are sorted from left to right.
 * • The first integer of each row is greater than the last integer of the
 * previous row.
 * For example, Consider the following matrix:
 * [
 * [1, 3, 5, 7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 * Date: Aug 22, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) return false;
        int n = matrix[0].length;
        int start = 0, end = matrix.length * n - 1, mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            int i = mid / n, j = mid % n;
            int temp = matrix[i][j];
            if (temp == target) return true;
            if (temp < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

    @Test
    public void test() {
        int[][] c = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        System.out.println(searchMatrix(c, 14));
    }
}
