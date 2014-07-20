package leetcode.fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem: 4 Sum
 * Description: Given an array S of n integers, are there elements a,b,c, and d
 * in S such that
 * a+b+c+d = target? Find all unique quadruplets in the array which gives the
 * sum of target.
 * Note:
 * • Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a
 * ≤ b ≤ c ≤ d)
 * • The solution set must not contain duplicate quadruplets.
 * For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 * A solution set is:
 * (-1, 0, 0, 1)
 * (-2, -1, 1, 2)
 * (-2, 0, 0, 2)
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int N = num.length;
        Arrays.sort(num);
        for (int i = 0; i < N; i++) {
            if (i > 0 && num[i] == num[i - 1]) continue;
            for (int j = i + 1; j < N; j++) {
                if (j > i + 1 && num[j] == num[j - 1]) continue;
                int l = j + 1, r = N - 1;
                while (l < r) {
                    int sum = num[i] + num[j] + num[l] + num[r];
                    if (sum > target) r--;
                    else if (sum < target) l++;
                    else {
                        List<Integer> quadruplet = new ArrayList<Integer>();
                        quadruplet.add(num[i]);
                        quadruplet.add(num[j]);
                        quadruplet.add(num[l]);
                        quadruplet.add(num[r]);
                        result.add(quadruplet);
                        l++;
                        r--;
                        while (l < r && num[l] == num[l - 1])
                            l++;
                        while (l < r && num[r] == num[r + 1])
                            r--;
                    }
                }
            }
        }
        return result;
    }
}
