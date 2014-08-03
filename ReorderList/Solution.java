package leetcode.reorderList;

import com.hyace.test.ListNode;

/**
 * Problem: Reorder List
 * Description: Given a singly linked list L : L 0 → L 1 → ··· → L n−1 → L n ,
 * reorder it to: L 0 → L n → L 1 → L n−1 → L 2 → L n−2 → ··· You must do this
 * in-place without altering the nodes’ values.
 * For example, Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * Date: Aug 3, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode q = head.next, s = head;

        while (q != null && q.next != null) {
            s = s.next;
            // if(q.next==null) break;
            q = q.next.next;
        }
        ListNode t = s.next;
        while (t.next != null) {
            ListNode temp = t.next;
            t.next = temp.next;
            temp.next = s.next;
            s.next = temp;
        }
        t = s.next;
        s.next = null;
        s = t;
        q = head;
        while (s != null) {
            t = t.next;
            s.next = q.next;
            q.next = s;
            s = t;
            q = q.next.next;
        }
    }
}
