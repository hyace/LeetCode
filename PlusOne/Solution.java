package leetcode.plusOne;

/**
 * Problem: Plus One
 * Description: Given a number represented as an array of digits,
 * plus one to the number.
 * 
 * @author Chyace
 *         Date: July 29, 2014
 * 
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int N = digits.length;
        int carry = 1;
        for (int i = N - 1; i >= 0 && carry > 0; i--) {
            carry = (digits[i] + 1) / 10;
            digits[i] = (digits[i] + 1) % 10;
        }
        int[] res = new int[N + 1];
        if (carry == 1) {
            res[0] = 1;
            for (int i = 1; i < N + 1; i++) {
                res[i] = digits[i - 1];
            }
            return res;
        }
        return digits;

    }
}
