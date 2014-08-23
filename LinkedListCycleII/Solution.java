package leetcode.linkedListCycleII;

import org.junit.Test;

import com.hyace.test.ListNode;

/**
 * Problem: Linked List Cycle
 * Description: Given a linked list, return the node where the cycle begins. If
 * there is no cycle, return null.
 * Follow up: Can you solve it without using extra space?
 * Date: Aug 2 , 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    /**
     * 设置两个指针，一个快一个慢，快的追上慢的，说明有环。
     * 
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode q = head, s = head;
        do {
            q = q.next.next;
            s = s.next;
        } while (q != null && q.next != null && q != s);
        if (q != s) return null;
        q = head;
        while (q != s) {
            q = q.next;
            s = s.next;
        }
        return s;
    }

    @Test
    public void test() {
        ListNode head = new ListNode(1);
        System.out.println(detectCycle(head));
    }
}
