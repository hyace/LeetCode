package leetcode.linkedListCycle;

import com.hyace.test.ListNode;

/**
 * Problem: Linked List Cycle
 * Description: Given a linked list, determine if it has a cycle in it.
 * Follow up: Can you solve it without using extra space?
 * Date: Aug 2 , 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    /**
     * 设置两个指针，一个快一个慢，快的追上慢的，说明有环。
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        ListNode q = head.next,s=head;
        while(q!=null&&q.next!=null && q!=s){
            q = q.next.next;
            s = s.next;
        }
        if(q==s)return true;
        return false;
    }
}
