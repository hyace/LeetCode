package leetcode.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem: 3Sum
 * Description: Given an array S of n integers, are there
 * elements a,b,c in S such that a + b + c = 0? Find all
 * unique triplets in the array which gives the sum of
 * zero.
 * Note: Elements in a triplet (a,b,c) must be in non-de
 * scending order. (ie, a ≤ b ≤ c)
 * The solution set must not contain duplicate triplets.
 * For example, given array S = {-1 0 1 2 -1 -4}.A solut
 * ion set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(num);
        for (int i = 0; i < num.length - 2 && num[i] <= 0; i++) {
            if (i > 0 && num[i] == num[i - 1]) continue;
            int curr = num[i];
            int sum = -curr;
            int l = i + 1, r = num.length - 1;
            while (l < r) {
                int temp = num[l] + num[r];
                if (temp > sum) r--;
                else if (temp < sum) l++;
                else {
                    List<Integer> triplet = new ArrayList<Integer>();
                    triplet.add(num[i]);
                    triplet.add(num[l]);
                    triplet.add(num[r]);
                    result.add(triplet);
                    l++;
                    r--;
                    while (l < r && num[l] == num[l - 1])
                        l++;
                    while (l < r && num[r] == num[r + 1])
                        r--;
                }
            }
        }
        return result;
    }
}
