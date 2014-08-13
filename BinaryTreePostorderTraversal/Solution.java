package leetcode.binaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import com.hyace.test.TreeNode;

/**
 * Problem: Binary Tree Postorder Traversal
 * Description: Given a binary tree, return the postorder traversal of its
 * nodes’ values. For example: Given binary tree {1,#,2,3},
 * 1
 * \
 * 2
 * /
 * 3
 * return [3,2,1].
 * Note: Recursive solution is trivial, could you do it iteratively?
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        postorder(root, arr);
        return arr;
    }

    private void postorder(TreeNode p, List<Integer> arr) {
        if (p == null) return;
        postorder(p.left, arr);
        postorder(p.right, arr);
        arr.add(p.val);
    }

    @Test
    public void test() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        ArrayList<Integer> arr = (ArrayList<Integer>) postorderTraversal(t1);
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
