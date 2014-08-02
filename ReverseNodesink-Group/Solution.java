package leetcode.reverseNodesinkGroup;

import com.hyace.test.ListNode;

/**
 * Problem: Reverse Nodes in k-Group
 * Description: Given a linked list, reverse the nodes of a linked list k at a
 * time and return its modified list. If the number of nodes is not a multiple
 * of k then left-out nodes in the end should remain as it is. You may not alter
 * the values in the nodes, only nodes itself may be changed.
 * Only constant memory is allowed.
 * For example,
 * Given this linked list: 1->2->3->4->5
 * For k = 2, you should return: 2->1->4->3->5
 * For k = 3, you should return: 3->2->1->4->5
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(-1), p = dummy;
        dummy.next = head;
        if (head == null || k < 2) return head;

        while (p != null && p.next != null) {
            ListNode q = p.next;
            int i = 1;
            for (; i < k && q.next != null; i++, q = q.next);
            if (i < k) break;
            q = p.next;

            for (i = 1; i < k; i++) {
                ListNode t = q.next;
                q.next = t.next;
                t.next = p.next;
                p.next = t;
            }
            p = q;
        }
        return dummy.next;
    }
}
