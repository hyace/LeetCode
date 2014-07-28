package leetcode.longestPalindromicSubstring;

/**
 * Problem: Longest Palindromic Substring
 * Description: Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000, and there exists
 * one unique longest palindromic substring.
 * Date: July 28, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public String longestPalindrome(String s) {
        int N = s.length();
        int l = 0, r = 0, L = 0, R = 0;
        for (int i = 1; i < N; i++) {
            l = i;
            while (i < N && s.charAt(i - 1) == s.charAt(i))
                i++;
            if (l != i) {
                i--;
                l--;
            }
            r = i;
            while (l > 0 && r < N - 1 && s.charAt(--l) == s.charAt(++r));
            if (s.charAt(l) != s.charAt(r)) {
                l++;
                r--;
            }
            if (r - l > R - L) {
                L = l;
                R = r;
            }
        }
        return s.substring(L, R + 1);
    }
}
