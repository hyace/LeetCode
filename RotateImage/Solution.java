package leetcode.rotateImage;

/**
 * Problem: Rotate Image
 * Description: You are given an n × n 2D matrix representing
 * an image. Rotate the image by 90 degrees (clockwise).
 * Follow up: Could you do this in-place?
 * Date: July 29,2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int swap = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = swap;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int swap = matrix[i][j];
                matrix[i][j] = matrix[i][N - 1 - j];
                matrix[i][N - 1 - j] = swap;
            }
        }
    }
}
