package leetcode.longestSubstringWithoutRepeatingCharacters;

import org.junit.Test;

/**
 * Problem: Longest Substring Without Repeating Characters
 * Description: Given a string, find the length of the longest substring without
 * repeating characters. For example, the longest substring without repeating
 * letters for ”abcabcbb” is ”abc”, which the length is 3. For ”bbbbb” the
 * longest substring is ”b”, with the length of 1.
 * Date: Aug 9, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    /**
     * 利用bit操作来判断是否有重复字符
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        int count = 0, bit = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            int ch = 1 << (s.charAt(i) - 'a');
            if ((bit & ch) == 0) {
                bit |= ch;
                count++;
            } else {
                bit = 0;
                count = 0;
            }
            res = Math.max(res, count);
        }
        return res;
    }

    @Test
    public void test() {
        String s = "bbbbbb";
//        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
