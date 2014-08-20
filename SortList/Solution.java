package leetcode.sortList;

import org.junit.Test;

import com.hyace.test.ListNode;
import com.hyace.test.TestLeetCode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/**
 * Problem: Sort List
 * Description: Sort a linked list in O(n log n) time using constant space
 * complexity.
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        sort(dummy);
        return dummy.next;
    }

    public void sort(ListNode dummy) {
        if (dummy.next.next == null) return;
        ListNode q = dummy.next, s = dummy;
        while (q != null && q.next != null) {
            s = s.next;
            q = q.next.next;
        }
        q = new ListNode(-1);
        q.next = s.next;
        s.next = null;
        sort(dummy);
        sort(q);
        merge(dummy, q);
    }

    public void merge(ListNode l1, ListNode l2) {
        ListNode p1 = l1.next, p2 = l2.next, p = l1;

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
    }

    @Test
    public void test() {
        ListNode head = new ListNode(10), cur = head;
        cur.next = new ListNode(9);
        cur = cur.next;
        cur.next = new ListNode(8);
        cur = cur.next;
        cur.next = new ListNode(5);
        cur = cur.next;
        cur.next = new ListNode(7);
        cur = cur.next;
        cur.next = new ListNode(71);
        cur = cur.next;
        cur.next = new ListNode(0);
        cur = cur.next;
        cur.next = new ListNode(6);
        cur = cur.next;
        cur.next = new ListNode(5);
        cur = cur.next;
        cur.next = new ListNode(15);
        cur = cur.next;
        cur.next = new ListNode(4);
        cur = cur.next;
        cur.next = new ListNode(22);
        cur = cur.next;
        cur.next = new ListNode(3);
        cur = cur.next;
        cur.next = new ListNode(31);
        cur = cur.next;
        cur.next = new ListNode(2);
        cur = cur.next;
        cur.next = new ListNode(1);
        TestLeetCode.printLinkedList(sortList(head));

    }
}