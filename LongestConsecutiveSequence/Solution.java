package leetcode.longestConsecutiveSequence;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Median of Two Sorted Arrays
 * Description: There are two sorted arrays A
 * and B of size m and n respectively. Find
 * the median of the two sorted arrays. The
 * overall run time complexity should be
 * O(log(m + n)).
 * 
 * author Hyace date:July 18, 2014
 * 
 */
public class Solution {
    public int longestConsecutive(int[] num) {
        Map<Integer, Boolean> mapping = new HashMap<Integer, Boolean>();
        for (int i = 0; i < num.length; i++)
            mapping.put(num[i], false);
        int count = 1;
        for (int i = 0; i < num.length; i++) {
            if (mapping.get(num[i])) continue;
            int t = num[i], time = 1;
            mapping.put(num[i], true);
            int p = t;
            while (mapping.containsKey(++p)) {
                mapping.put(p, true);
                time++;
            }
            while (mapping.containsKey(--t)) {
                mapping.put(t, true);
                time++;
            }
            count = count > time ? count : time;
        }
        return count;
    }
}
