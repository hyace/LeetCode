package leetcode.copyListwithRandomPointer;

import com.hyace.test.RandomListNode;

/**
 * Problem: Copy List with Random Pointer
 * Description: A linked list is given such that each node contains an
 * additional random pointer which could point to any node in the list or null.
 * Return a deep copy of the list.
 * 
 * @author Chyace
 * 
 */
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 * int label;
 * RandomListNode next, random;
 * RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    /**
     * 首先遍历链表，对于每一个node，都新建一个节点，插入到node之后，这样不会丢失random，可以完成深度复制。第二次间隔遍历链表，
     * 复制random。最后对链表进行拆分。
     * 
     * @param head
     * @return
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        for (RandomListNode cur = head; cur != null; cur = cur.next.next) {
            RandomListNode node = new RandomListNode(cur.label);
            node.next = cur.next;
            cur.next = node;
        }

        for (RandomListNode cur = head; cur != null; cur = cur.next.next)
            if (cur.random != null) cur.next.random = cur.random.next;

        RandomListNode dummy = new RandomListNode(-1), p = dummy;
        for (RandomListNode cur = head; cur != null; cur = cur.next) {
            p.next = cur.next;
            p = p.next;
            cur.next = cur.next.next;
        }
        return dummy.next;
    }
}