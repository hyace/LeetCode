package leetcode.implementstrStr;

import java.util.Arrays;

import org.junit.Test;

/**
 * Problem: Implement strStr()
 * Description: Implement strStr().Returns a pointer to the first occurrence of
 * needle in haystack, or null if needle is not part of haystack.
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public String strStr(String haystack, String needle) {
        int nh = haystack.length(), nn = needle.length();
        int hs = 0;
        while (true) {
            int h = hs, n = 0;
            while (h < nh && n < nn && haystack.charAt(h) == needle.charAt(n)) {
                h++;
                n++;
            }
            if (n == nn) return haystack.substring(hs);
            if (h == nh) return null;
            hs++;
        }
    }

    public String strStrII(String haystack, String needle) {
        StringBuilder sb = new StringBuilder(haystack);
        int res = sb.indexOf(needle);
        return res == -1 ? null : haystack.substring(res);
    }

    /**
     * 失败了...失败的case是两大串a，第二个串最后有个b，加了注释行判断勉强通过，不过太丑了。KMP以后再实现。
     * 
     * @param haystack
     * @param needle
     * @return
     */
    public String strStrIII(String haystack, String needle) {
        int nh = haystack.length(), nn = needle.length();
        if (nn == 0) return haystack;
        int[] pos = new int[nh];
        Arrays.fill(pos, -1);
        int count = 0;
        for (int i = 0; i < nh; i++)
            if (haystack.charAt(i) == needle.charAt(0)) pos[count++] = i;
        // if (haystack.charAt(i) == needle.charAt(0) && (i+nn-1<nh &&
        // haystack.charAt(i+nn-1) == needle.charAt(nn-1))) pos[count++] = i;
        if (count == 0) return null;
        for (int i = 0; i < count; i++) {
            int p = pos[i];
            if (p == -1) break;
            int j = 0;
            for (; j < nn && p < nh; j++)
                if (haystack.charAt(p++) != needle.charAt(j)) break;
            if (j == nn) return haystack.substring(pos[i]);
        }
        return null;
    }

    @Test
    /**
     * 此后的junit case 都写到相应的类中
     */
    public void test() {
        String str1 = "mississippi";// "asdfghjkl";
        String str2 = "issip";// "hj";
        System.out.println(strStrIII(str1, str2));
    }
}
