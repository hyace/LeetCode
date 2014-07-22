package leetcode.permutationSequence;

import java.util.Arrays;

/**
 * Problem: Pascal’s Triangle
 * Description: The set [1,2,3,⋯,n] contains a total of n! unique permutations.
 * By listing and labeling all of the permutations in order, We get the 
 * following sequence (ie, for n = 3):
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * Given n and k, return the kth permutation sequence. 
 * Note: Given n will be between 1 and 9 inclusive.
 * Date: July 22, 2014
 * @author Chyace
 *
 */
public class Solution {
    //利用NextPermutation来计算
    public String getPermutation(int n, int k){
        int[] a = new int[n];
        for(int i = 0;i<n;i++) a[i] = i+1;
        for(int i = 1;i<k;i++) nextPermutation(a);
        StringBuilder sb = new StringBuilder();
        for(int i : a) sb.append(i);
        return sb.toString();
    }
    private void nextPermutation(int[] num) {
        int N = num.length;
        int i = N - 1;
        while (num[i] <= num[i - 1] && i > 0)
            i--;
        Arrays.sort(num, i, N );
        if (i == 0) return;
        int j = i;
        while (num[i - 1] >= num[j] && j < N)
            j++;
        int swap = num[i - 1];
        num[i - 1] = num[j];
        num[j] = swap;
    }
}
