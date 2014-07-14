/**
 * Problem:Remove Duplicates from Sorted Array II 
 * Follow up for ”Remove Duplicates”: What if dupli
 * cates are allowed at most twice?For example, Giv
 * en sorted array A = [1,1,1,2,2,3],Your function sho
 * uld return length = 5, and A is now [1,1,2,2,3]
 * 
 * author Hyace date:July 14, 2014
 * 
 */
public class Solution {
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n <= 2)
            return n;
        int point = 2;
        for (int i = 2; i < n; i++) {
            if (arr[point - 2] != arr[i])
                arr[point++] = arr[i];
        }
        return point;
    }
}
