package leetcode.validPalindrome;

/**
 * Problem: Valid Palindrome
 * Description: Given a string, determine if it is a palindrome, considering
 * only alphanumeric characters and ignoring cases.
 * For example,
 * ”A man, a plan, a canal: Panama” is a palindrome.
 * ”race a car” is not a palindrome.
 * Note: Have you consider that the string might be empty? This is a good
 * question to ask during an interview.
 * For the purpose of this problem, we define empty string as valid palindrome.
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch) || Character.isDigit(ch))
                sb.append(s.charAt(i));
        }
        if (sb == null || sb.length() == 0) return true;
        StringBuilder sbr = new StringBuilder(sb);
        sbr.reverse();
        return sbr.toString().equals(sb.toString());
    }

    public boolean isPalindromeII(String s) {
        if (s == null || s.length() == 0) return true;
        s = s.toLowerCase();
        int N = s.length();
        int left = 0, right = N - 1;
        while (left < right) {
            char lch = s.charAt(left);
            char rch = s.charAt(right);
            if (!Character.isLetter(lch) && !Character.isDigit(lch)) left++;
            else if (!Character.isLetter(rch) && !Character.isDigit(rch)) right--;
            else if (lch != rch) return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}
