package leetcode.singleNumberII;

/**
 * Problem: Single Number II
 * Desctiption: Given an array of integers, every element appears three
 * times except for one. Find that single one. Note: Your algorithm
 * should have a linear runtime complexity. Could you implement it
 * without using extra memory?
 * 
 * @author Chyace
 * 
 */
public class Solution {
    /**
     * 通过统计所有数的所有位，来得到唯一的数
     * 
     * @param A
     * @return
     */
    public int singleNumber(int[] A) {
        int N = A.length;
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0, bit = 1 << i;
            for (int j = 0; j < N; j++)
                if ((A[j] & bit) != 0) count++;
            if (count % 3 != 0) res |= bit;
        }
        return res;
    }
}
