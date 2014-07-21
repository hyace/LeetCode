package leetcode.removeElement;

/**
 * Problem: Remove Element
 * Description: Given an array and a value, remove all instances of
 * that value in place and return the new length. The order of ele
 * ments can be changed. It doesn’t matter what you leave beyo
 * nd the new length.
 * Date: July 21 , 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public int removeElement(int[] A, int elem) {
        int N = A.length;
        int count = 0;
        for (int i = 0; i < N; i++)
            if (A[i] != elem) A[count++] = A[i];
        return count;
    }
}
