package leetcode.addBinary;

import org.junit.Test;

/**
 * Problem: Add Binary
 * Description: Given two binary strings, return their sum (also a binary
 * string).
 * 
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public String addBinary(String a, String b) {
        int an = a.length(), bn = b.length();
        if (a == null || an == 0) return b;
        if (b == null || bn == 0) return a;
        // len = an>bn?an:bn;
        StringBuilder res = new StringBuilder();
        int i = an - 1, j = bn - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            res.append(sum % 2);
            carry = sum / 2;
        }
        if (carry == 1) res.append(1);
        return res.reverse().toString();
    }

    @Test
    public void test() {
        System.out.println(addBinary("11100000111", "1111111"));
    }
}
