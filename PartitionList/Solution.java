package leetcode.partitionList;

/**
 * Problem: Partition List
 * Description: Given a linked list and a value x, partition it such that all
 * nodes less than x come before nodes greater than or equal to x. You should
 * preserve the original relative order of the nodes in each of the two
 * partitions.
 * For example, Given 1->4->3->2->5->2 and x = 3,
 * return1->2->2->4->3->5.
 * Date: Aug 1, 2014
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(0), cur = dummy, ins = null;
        dummy.next = head;
        while (cur.next != null) {
            ListNode temp = cur;
            cur = cur.next;
            if (cur.val < x && ins == null) continue;
            if (cur.val >= x && ins == null) ins = temp;
            if (cur.val < x) {
                temp.next = cur.next;
                cur.next = ins.next;
                ins.next = cur;
                ins = cur;
                cur = temp;
            }
        }
        return dummy.next;
    }
}
