/**
 * Problem: Median of Two Sorted Arrays
 * There are two sorted arrays A and B of 
 * size m and n respectively. Find the 
 * median of the two sorted arrays. The 
 * overall run time complexity should be 
 * O(log(m + n)).
 *
 * author Hyace
 * date:July 16, 2014
 *
 */
public class Solution{
	public static int findMedianSortedArrays(int[] a,int[] b){
		int na = a.length, nb = b.length;
		int mid = (na+nb)/2;
		return find(a,0,na-1,b,0,nb-1);
	}
	private static int find(int[] a,int la,int ra,int[] b,int lb,int rb){
	
		if(a[mid/2-1]<b[mid/2-1])
			return find();	
	}
}

