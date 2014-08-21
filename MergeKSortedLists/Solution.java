package leetcodemergeKSortedLists;

import java.util.List;

import com.hyace.test.ListNode;

/**
 * Problem: Merge k Sorted Lists
 * Description: Merge k sorted linked lists and return it as one sorted list.
 * Analyze and describe its complexity.
 * 
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
    public ListNode mergeKLists(List<ListNode> lists) {
        if (lists == null || lists.size() == 0) return null;
        int n = lists.size();
        ListNode dummy = new ListNode(-1);
        dummy.next = lists.get(0);
        for (int i = 1; i < n; i++) {
            ListNode t = new ListNode(-1);
            t.next = lists.get(i);
            merge(dummy, t);
        }
        return dummy.next;
    }

    private void merge(ListNode dummy, ListNode t) {
        ListNode p1 = dummy.next, p2 = t.next, p = dummy;
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
}