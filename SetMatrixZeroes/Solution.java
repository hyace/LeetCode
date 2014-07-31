package leetcode.setMatrixZeroes;

/**
 * Problem: Set Matrix Zeroes
 * Description: Given a m × n matrix, if an element is 0, set its entire row and
 * column to 0. Do it in place. Follow up: Did you use extra space? A straight
 * forward solution using O(mn) space is probably a bad idea. A simple
 * improvement uses O(m + n) space, but still not the best solution. Could
 * you devise a constant space solution?
 * 
 * Date: July 31, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 0) return;
        boolean rowflag = false, colflag = false;
        for (int i = 0; i < n && !rowflag; i++)
            rowflag = (matrix[0][i] == 0);
        for (int i = 0; i < m && !colflag; i++)
            colflag = (matrix[i][0] == 0);
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][j] == 0) matrix[i][0] = matrix[0][j] = 0;

        for (int i = 1; i < m; i++)
            if (matrix[i][0] == 0) for (int j = 1; j < n; j++)
                matrix[i][j] = 0;
        for (int j = 1; j < n; j++)
            if (matrix[0][j] == 0) for (int i = 1; i < m; i++)
                matrix[i][j] = 0;
        if (rowflag) for (int i = 0; i < n; i++)
            matrix[0][i] = 0;
        if (colflag) for (int i = 0; i < m; i++)
            matrix[i][0] = 0;

    }
}
