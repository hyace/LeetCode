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

    // 这个算法是从Annie Kim姐的第四种方法改的Java版，但是实际测试中，时间比上一种慢不少，而且空间占用还大，会造成内存耗尽。
    // 调整了虚拟机的Heap Size， 在处理27M的字符串时，上一种运行一秒，这种运行2.5秒。
    public String longestPalindromeII(String s) {
        int N = s.length();
        int[] dp = new int[2 * N + 1];
        int id = 0, mx = 0;
        for (int i = 0; i < 2 * N + 1; ++i) {
            int j = 2 * id - i;
            dp[i] = mx > i ? Math.min(dp[j], mx - i) : 1;
            int left = i - dp[i], right = i + dp[i];
            for (; left >= 0 && right <= 2 * N; left--, right++) {
                if (left % 2 == 0 || s.charAt(left / 2) == s.charAt(right / 2)) dp[i]++;
                else break;
            }
            if (i + dp[i] > mx) {
                id = i;
                mx = id + dp[id];
            }
        }
        int res = 0;
        for (int i = 1; i < 2 * N + 1; ++i)
            if (dp[i] > dp[res]) res = i;
        int start = res / 2 - (dp[res] - 1) / 2;
        return s.substring(start, start + dp[res] - 1);
    }
}
