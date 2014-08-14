package leetcode.reverseInteger;

/**
 * Problem: Reverse Integer
 * Description: Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x > 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }
}
