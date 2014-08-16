package leetcode.insertionSortList;

import org.junit.Test;

import com.hyace.test.ListNode;

/**
 * Problem: Insertion Sort List
 * Description: Sort a linked list using insertion sort.
 * @author Chyace
 *
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(Integer.MIN_VALUE), p = dummy;
        dummy.next = head;
        ListNode q = p.next;
        while (p != null || q != null) {
            if (p.val > q.val) {
                insert(dummy, p, q);
                p = p.next;
            }
            q = p.next;

        }
        return null;
    }

    private void insert(ListNode dummy, ListNode end, ListNode ins) {
        ListNode p = dummy.next;
        while (p.next.val < ins.val)
            p = p.next;
        end.next = ins.next;
        ins.next = p.next;
        p.next = ins;
    }

    @Test
    public void test() {
        ListNode head = new ListNode(10), cur = head;
        cur.next = new ListNode(9);
        cur = cur.next;
        cur.next = new ListNode(8);
        cur = cur.next;
        cur.next = new ListNode(7);
        cur = cur.next;
        cur.next = new ListNode(6);
        cur = cur.next;
        cur.next = new ListNode(5);
        cur = cur.next;
        cur.next = new ListNode(4);
        cur = cur.next;
        cur.next = new ListNode(3);
        cur = cur.next;
        cur.next = new ListNode(2);
        cur = cur.next;
        cur.next = new ListNode(1);
        insertionSortList(head);
    }
}
