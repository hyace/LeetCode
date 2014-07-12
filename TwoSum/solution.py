/**
 * Problem: Two Sum
 * Description: Given an array of integers, find two numbers such that they add
 * up to a specific target number.The function twoSum should return indices of
 * the two numbers such that they add up to the target, where index1 must be
 * less than index2. Please note that your returned answers (both index1 and
 * index2) are not zero-based. 
 * Url:https://oj.leetcode.com/problems/two-sum/
 */
class Solution:
    def twosum(self, num, target):
        n = len(num)
        mapping = {}
        for i in range(n):
            mapping[num[i]] = i
        result = [0, 0]
        for i in range(n):
            t = target - num[i]
            if t in mapping:
                result[0] = min(i + 1, mapping[t] + 1)
                result[1] = max(i + 1, mapping[t] + 1)
        return result

