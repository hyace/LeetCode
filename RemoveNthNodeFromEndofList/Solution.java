package leetcode.removeNthNodeFromEndofList;

import com.hyace.test.ListNode;

/**
 * Problem: Remove Nth Node From End of List
 * Description: Given a linked list, remove the n th node from the end of list
 * and return its head.
 * For example, Given linked list: 1->2->3->4->5, and n = 2. After removing the
 * second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * • Given n will always be valid.
 * • Try to do this in one pass.
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1), p = dummy, q = dummy;
        dummy.next = head;
        if (head == null || n == 0) return head;
        for (int i = 0; i < n; i++)
            p = p.next;
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return dummy.next;
    }
}
