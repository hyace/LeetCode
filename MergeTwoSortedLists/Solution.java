package leetcode.mergeSortedLists;

import com.hyace.test.ListNode;
import com.hyace.test.TestLeetCode;

import org.junit.Test;

/**
 * Problem: Merge Sorted Lists
 * Description: Merge two sorted linked lists and return
 * it as a new list. The new list should be made by splicing
 * togetherthe nodes of the first two lists.
 * Date: July 18 , 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1), p = res, p1 = l1, p2 = l2;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p.next = p1;
                p = p.next;
                p1 = p1.next;
            } else {
                p.next = p2;
                p = p.next;
                p2 = p2.next;
            }
        }
        if (p1 != null) p.next = p1;
        if (p2 != null) p.next = p2;
        return res.next;
    }

    @Test
    public void test() {
        ListNode head1 = new ListNode(1), cur = head1;
        cur.next = new ListNode(4);
        cur = cur.next;
        cur.next = new ListNode(8);

        ListNode head2 = new ListNode(3);
        cur = head2;
        cur.next = new ListNode(5);
        cur = cur.next;
        cur.next = new ListNode(7);

        TestLeetCode.printLinkedList(mergeTwoLists(head1, head2));

    }
}
