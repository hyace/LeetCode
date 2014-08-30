package leetcode.maximumSubarray;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

/**
 * Problem: Maximum Subarray
 * Description: Find the contiguous subarray within an array (containing at
 * least one number) which has the largest sum.
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 * 
 * More practice:
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public int maxSubArray(int[] A) {
        if (A == null || A.length == 0) return 0;
        int sum = A[0], max = sum;
        int n = A.length;
        for (int i = 1; i < n; i++) {
            sum = Math.max(sum + A[i], A[i]);
            if (sum > max) max = sum;
        }
        return max;
    }

    int[] a;

    @Before
    /**
     * 一个例子过了运行时间，测试了没问题，原来是方法里加了pringln...
     * @throws IOException
     */
    public void before() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(
                "src/leetcode/maximumSubarray/number.txt"));
        String[] str = br.readLine().split(",");
        a = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            a[i] = Integer.parseInt(str[i]);
        }
        br.close();
    }

    @Test
    public void test() {
        // int[] a = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(a));
    }
}
