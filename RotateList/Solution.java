package leetcode.rotateList;

import com.hyace.test.ListNode;

/**
 * Problem: Rotate List
 * Description: Given a list, rotate the list to the right by k places, where k
 * is non-negative.
 * For example: Given 1->2->3->4->5->nullptr and k = 2, return
 * 4->5->1->2->3->nullptr.
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode p = head, ins = head;
        int n = 1;
        if (head == null || k == 0) return head;
        while (p.next != null) {
            n++;
            p = p.next;
        }
        k = k % n;
        if (k == 0) return head;
        for (int i = 1; i < n - k; i++)
            ins = ins.next;
        p.next = head;
        head = ins.next;
        ins.next = null;

        return head;
    }
}
