package leetcode.removeDuplicatesfromSortedList;

import com.hyace.test.ListNode;

/**
 * Problem: Remove Duplicates from Sorted List
 * Description: Given a sorted linked list, delete all duplicates such that each
 * element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode p = head;
        while (p.next != null) {
            if (p.val == p.next.val) p.next = p.next.next;
            else p = p.next;
        }
        return head;
    }
}
