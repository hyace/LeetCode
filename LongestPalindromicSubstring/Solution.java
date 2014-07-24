package leetcode.longestPalindromicSubstring;

/**
 * Problem: Longest Palindromic Substring
 * Description: Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000, and there exists
 * one unique longest palindromic substring.
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public String longestPalindrome(String s) {
        int N = s.length();
        int l = 0, r = 0, L = 0, R = 0;
        for (int i = 1; i < N - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                l = i;
                r = i + 1;
            } else if (s.charAt(i - 1) == s.charAt(i + 1)) {
                l = i - 1;
                r = i + 1;
            } else continue;
            while (l > 0 && r < N && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            if (r - l > R - L) {
                L = l;
                R = r;
            }
        }
        return s.substring(L, R);
    }
}
