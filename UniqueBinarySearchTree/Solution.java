package leetcode.uniqueBinarySearchTrees;

import org.junit.Test;

/**
 * Problem: Unique Binary Search Trees
 * Description: Given n, how many structurally unique BST's (binary search
 * trees) that store values 1...n? For example,
 * Given n = 3, there are a total of 5 unique BST's.
 * 1        3       3       2      1
 *   \     /        /       / \       \
 *    3  2       1       1    3       2
 *   /  /          \                       \
 * 2  1            2                       3
 * 
 * @author Chyace
 *         Date: Aug 22, 2014
 */
public class Solution {
    public int numTrees(int n) {
        int[] m = new int[n + 1];
        m[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            int sum = 0;
            for (int j = i; j > 0; j--) {
                sum += m[j - 1] * m[i - j];
            }
            m[i] = sum;
        }
        return m[n];
    }

    @Test
    public void test() {
        System.out.println(numTrees(2));
    }
}
