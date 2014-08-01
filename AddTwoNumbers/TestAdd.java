package leetcode.addTwoNumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

    @Test
    public void test() {
        ListNode l1 = new ListNode(0), l2 = new ListNode(0);
        Solution s = new Solution();

        System.out.println(s.addTwoNumbers(l1, l2).val);
    }

}
