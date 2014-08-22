package leetcode.sameTree;

import com.hyace.test.TreeNode;

/**
 * Problem: Same Tree
 * Description: Given two binary trees, write a function to check if they are
 * equal or not. Two binary trees are considered equal if they are structurally
 * identical and the nodes have the same value.
 * 
 * @author Chyace
 * 
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null) return q == null;
        if (p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;
    }
}