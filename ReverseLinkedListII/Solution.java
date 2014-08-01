package leetcode.reverseLinkedListII;

/**
 * Problem: Reverse Linked List II
 * Description: Reverse a linked list from position m to n. Do it in-place and
 * in one-pass. For example: Given 1->2->3->4->5->nullptr, m = 2 and n = 4,
 * return 1->4->3->2->5->nullptr.
 * Note: Given m, n satisfy the following condition: 1 ≤ m ≤ n ≤ length of list.
 * 
 * @author Chyace
 *         Date: Aug 1, 2014
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1), p = dummy, q = null;
        dummy.next = head;
        for (int i = 1; i < m; i++)
            p = p.next;
        q = p.next;
        for (int i = m; i < n; i++) {
            ListNode temp = q.next;
            q.next = temp.next;
            temp.next = p.next;
            p.next = temp;
        }
        return dummy.next;
    }
}
