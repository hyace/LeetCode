package leetcode.pascalsTriangleII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem: Pascal's Triangle II
 * Desctiption: Given an index k, return the k th row of the Pascal’s
 * triangle. For example, given k = 3, Return [1,3,3,1].
 * Note: Could you optimize your algorithm to use only O(k) extra
 * space?
 * Date: July 22 , 2014
 * @author Chyace
 * 
 */
public class Solution {

    public List<Integer> getRow(int rowIndex) {
        Integer[] r = new Integer[rowIndex + 1];
        Arrays.fill(r, 1);
        for (int i = 1; i <= rowIndex; i++)
            for (int j = i - 1; j >= 1; j--)
                r[j] += r[j - 1];
        return Arrays.asList(r);
    }

    public List<Integer> getRowII(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        // 这种算法在rowIndex稍大就会溢出,到18就挂了
        for (int i = 0; i < rowIndex + 1; i++) {
            res.add(c(rowIndex, Math.max(i, rowIndex - i)));
        }
        return res;
    }

    private Integer c(int r, int i) {
        if (r == 0) return 1;
        return m(i + 1, r) / m(1, r - i);
    }

    private int m(int f, int l) {
        int res = 1;
        for (; f <= l; f++)
            res *= f;
        return res;
    }

}
