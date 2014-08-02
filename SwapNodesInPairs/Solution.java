package leetcode.swapNodesinPairs;

import com.hyace.test.ListNode;

/**
 * Prolem: Swap Nodes in Pairs
 * Description: Given a linked list, swap every two adjacent nodes and return
 * its head.
 * For example, Given 1->2->3->4, you should return the list as 2->1->4->3. Your
 * algorithm should use only constant space. You may not modify the values in
 * the list, only nodes itself can be changed.
 * Date: Aug 2, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1), p = dummy;
        dummy.next = head;
        if (head == null || head.next == null) return head;
        while (p.next != null && p.next.next != null) {
            ListNode q = p.next, t = q.next;
            q.next = t.next;
            t.next = q;
            p.next = t;
            p = q;
        }
        return dummy.next;
    }
}
