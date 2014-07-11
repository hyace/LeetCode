/*
 * Problem:Remove Duplicates from Sorted Array
 * Given a sorted array, remove the duplicates 
 * in place such that each element appear only 
 * once and return the new length. Do not 
 * allocate extra space for another array, you
 * must do this in place with constant memory.
 * For example, Given input array A = [1,1,2],
 * Your function should return length = 2, and
 * A is now [1,2].
 * 
 * author Hyace
 * date:May 24, 2014
 *
 */
public class RemoveDuplicates{
	public static void main(String[] args){
		
	}
	public static int removeDuplicates(int[] arr){
		int n = arr.length;
		int point=0;
		for(int i=1;i<n;i++){
			if(arr[point]!=arr[i])
				arr[++point]=arr[i];
		}
		return point+1;
	}
}
