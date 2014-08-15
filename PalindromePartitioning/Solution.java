package leetcode.palindromePartitioning;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Problem: Palindrome Partitioning
 * Description: Given a string s, partition s such that every substring of the
 * partition is a palindrome. Return all possible palindrome partitioning of s.
 * For example, given s = "aab",
 * Return
 * [
 * ["aa","b"],
 * ["a","a","b"]
 * ]
 * Date: Aug 14, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    List<List<String>> res = new ArrayList<List<String>>();

    public List<List<String>> partition(String s) {
        ArrayList<String> list = new ArrayList<String>();
        add(s, 0, s.length(), list);
        return res;
    }

    private void add(String s, int start, int end, List<String> list) {
        if (valid(s.substring(start, end))) {
            list.add(s.substring(start, end));
            if (end == s.length()) {
                res.add(list);
                list.clear();
            }
        }
        for (int i = start + 1; i < end; i++) {
            String sub = s.substring(start, i);
            if (valid(sub)) {
                ArrayList<String> t = new ArrayList<String>(list);
                t.add(sub);
                add(s, i, end, t);
            }
        }
    }

    private boolean valid(String s) {
        if (s == null || s.length() == 0) return false;
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }

    @Test
    public void test() {
        partition("baa");
        System.out.println(res);
    }
}
