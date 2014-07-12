/**
 * Problem: Two Sum
 * Description: Given an array of integers, find two numbers such that they add
 * up to a specific target number.The function twoSum should return indices of
 * the two numbers such that they add up to the target, where index1 must be
 * less than index2. Please note that your returned answers (both index1 and
 * index2) are not zero-based. 
 * Url:https://oj.leetcode.com/problems/two-sum/
 */
public class Solution {
    public int[] twoSum(int[] num, int target) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int N = num.length;
        int[] result = null;
        for (int i = 0; i < N; i++)
            hm.put(num[i], i);
        for (int i = 0; i < N; i++) {
            int t = target - num[i];
            if (hm.containsKey(t) && hm.get(t) != i) {
                result = new int[2];
                result[0] = Math.min(i, hm.get(t)) + 1;
                result[1] = Math.max(i, hm.get(t)) + 1;
            }
        }
        return result;
    }
}

