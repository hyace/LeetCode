package leetcode.lengthofLastWord;

import org.junit.Test;

/**
 * Problem: Length of Last Word
 * Description: Given a string s consists of upper/lower-case alphabets and
 * empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space
 * characters only.
 * For example, Given s = "Hello World", return 5.
 * Date: Aug 8,2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    /**
     * 这道题全赖Java特性。。。加返回值两行
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        String[] str = s.trim().split(" ");

        return str[str.length - 1].length();
    }

    @Test
    public void test() {
        System.out.println(lengthOfLastWord("hello world"));
    }
}
