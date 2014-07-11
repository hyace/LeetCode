/**
 * Problem:Single Number
 * Description:Given an array of integers, every element appears 
 * twice except for one. Find that single one.
 * Url:https://oj.leetcode.com/problems/single-number/
 */
class Solution:
    # @param A, a list of integer
    # @return an integer
    def singleNumber(self, A):
		r=0;
		for i in A:
			r = r^i
		return r
