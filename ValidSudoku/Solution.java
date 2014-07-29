package leetcode.validSudoku;

import java.util.Arrays;

/**
 * Problem: Valid Sudoku
 * Description: Determine if a Sudoku is valid, according to: Sudoku
 * Puzzles - The Rules http://sudoku.com.au/TheRules.aspx . The
 * Sudoku board could be partially filled, where empty cells are filled
 * with the character '.'.
 * Date: July 29 , 2014
 * @author Chyace
 * 
 */
public class Solution {
    /**
     * 这种方法是利用了一个int型来表示一行或一列或一个九宫的向量，int不是表示数，每一位代表一个数，
     * 为1表示有，0表示没有。对于每一个char，将其转换为表示它的int向量，与其所在行列宫的int数分别
     * 作&操作，只要结果为零，说明它的1在行列宫中都没有，不为零，说明有重复。
     *     为零后，将该位添加到行列宫3个向量中。
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        int row;
        int[] col = new int[N], box = new int[N];
        Arrays.fill(col, 0);
        Arrays.fill(box, 0);
        for (int i = 0; i < N; ++i) {
            row = 0;
            for (int j = 0; j < N; ++j) {
                if (board[i][j] == '.') continue;
                int bit = 1 << (board[i][j] - '1');
                int box_index = i / 3 * 3 + j / 3;
                if ((row & bit) != 0 || (col[j] & bit) != 0 || (box[box_index] & bit) != 0) return false;
                row |= bit;
                col[j] |= bit;
                box[box_index] |= bit;
            }
        }
        return true;
    }
}
