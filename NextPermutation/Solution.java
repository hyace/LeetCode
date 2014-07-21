package leetcode.nextPermutation;

/**
 * Problem: Next Permutation
 * Desctription: Implement next permutation, which rearranges numbers
 * into the lexicographically next greater permu-tation of numbers. If su
 * ch arrangement is not possible, it must rearrange it as the lowest poss
 * ible order (ie, sorted in ascend-ing order). The replacement must be
 * in-place, do not allocate extra memory.
 * Here are some examples. Inputs are in the left-hand column and its
 * corresponding outputs are in the right-hand column.
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,31,1,5 → 1,5,1
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public void nextPermutation(int[] num) {
        int N = num.length;
        int par = -1;
        for (int i = N - 2; i >= 0; i--)
            if (num[i] < num[i + 1]) {
                par = i;
                break;
            }
        if (par == -1) {
            reverse(num, 0, N - 1);
            return;
        }
        int exch = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (num[i] > num[par]) {
                exch = i;
                break;
            }
        }
        swap(num, par, exch);
        reverse(num, par + 1, N - 1);
    }

    private void reverse(int[] a, int i, int j) {
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
