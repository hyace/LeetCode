package leetcode.reverseWordsInAString;

/**
 * Problem: Reverse words in a string
 * Description: Given an input string, reverse the string word by word.
 * For example,
 * Given s = "the sky is blue", return "blue is sky the".
 * Clarification:
 * What constitutes a word?
 * A sequence of non-space characters constitutes a word.
 * Could the input string contain leading or trailing spaces?
 * Yes. However, your reversed string should not contain leading or trailing
 * spaces.
 * How about multiple spaces between two words?
 * Reduce them to a single space in the reversed string.
 * Date: July 29, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        int N = words.length;
        StringBuilder sb = new StringBuilder();
        for (int i = N - 1; i >= 0; i--) {
            if (words[i].equals("")) continue;
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}
