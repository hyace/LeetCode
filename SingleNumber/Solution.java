/**
 * Problem:Single Number
 * Description:Given an array of integers, every element appears 
 * twice except for one. Find that single one.
 * Url:https://oj.leetcode.com/problems/single-number/
 */
//可以对array中的数累计异或，凡是偶数的都清空
public class Solution{
	public int singleNumber(int[] A){
		int r = 0;
		for(int i:A)
			r^=i;
		return r;
	}
}
