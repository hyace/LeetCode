package leetcode.addTwoNumbers;

/**
 * Problem: Add Two Numbers
 * Description: You are given two linked lists representing two non-negative
 * numbers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked
 * list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(-1), cur = dummy;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            sum %= 10;
            ListNode node = new ListNode(sum);
            cur.next = node;
            cur = cur.next;
        }
        return dummy.next;
    }
}
