package leetcode.removeDuplicatesfromSortedListII;

import com.hyace.test.ListNode;

/**
 * Problem: Remove Duplicates from Sorted List II
 * Description: Given a sorted linked list, delete all nodes that have duplicate
 * numbers, leaving only distinct numbers from the original list.
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode q = dummy, p = head;

        while (p.next != null) {
            while (p.next != null && p.val == p.next.val)
                p = p.next;
            if (p.next == null) {
                q.next = null;
                break;
            }
            if (p.val != p.next.val) {
                if (q.next == p) q = p;
                else q.next = p.next;
                p = p.next;
            }
        }
        return head;
    }
}
