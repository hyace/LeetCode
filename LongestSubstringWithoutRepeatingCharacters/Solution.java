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
     * 原以为考察的字符只是字母，结果出来一大串各种符号，所以bit操作的算法不适用了
     * 
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        int res = 1, start = 0;
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            int last = s.substring(0, i).lastIndexOf(ch);
            if (last < start) {
                res = Math.max(res, i - start + 1);
            } else start = last + 1;
        }
        return res;
    }

    // public int lengthOfLongestSubstring(String s) {
    // if (s == null || s.length() == 0) return 0;
    // int count = 0, bit = 0, res = 0;
    // for (int i = 0; i < s.length(); i++) {
    // int ch = 1 << (s.charAt(i) - 'a');
    // if ((bit & ch) == 0) {
    // bit |= ch;
    // count++;
    // } else {
    // bit = 0;
    // count = 0;
    // i = s.substring(0, i).lastIndexOf(s.charAt(i)) + 1;
    // }
    // res = Math.max(res, count);
    // }
    // return res;
    // }

    @Test
    public void test() {
        String s = "wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco";
        // String s = "acbbabcdebb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
