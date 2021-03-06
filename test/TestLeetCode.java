package com.hyace.test;

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;

//import leetcode.searchInRotatedSortedArray.Solution;

//import leetcode.removeDuplicatesFromSortedArrayII.Solution;

//import leetcode.removeDuplicatesFromSortedArray.Solution;

//import leetcode.simplenumber.Solution;

//import leetcode.twosum.Solution;

//import leetcode.searchInRotatedSortedArrayII.Solution;

//import leetcode.medianOfTwoSortedArrays.Solution;

//import leetcode.longestConsecutiveSequence.Solution;

//import leetcode.mergeSortedArrays.Solution;

//import leetcode.threeSum.Solution;

//import leetcode.threeSumClosest.Solution;

//import leetcode.fourSum.Solution;

//import leetcode.removeElement.Solution;

//import leetcode.nextPermutation.Solution;

//import leetcode.pascalsTriangleII.Solution;

//import leetcode.permutationSequence.Solution;

//import leetcode.longestPalindromicSubstring.Solution;

//import leetcode.reverseWordsInAString.Solution;

//import leetcode.validSudoku.Solution;

//import leetcode.trappingRainWater.Solution;

//import leetcode.climbingStairs.Solution;

//import java.util.List;

//import leetcode.grayCode.Solution;

//import leetcode.plusOne.Solution;

//import leetcode.rotateImage.Solution;

//import leetcode.setMatrixZeroes.Solution;

//import leetcode.singleNumberII.Solution;

//import leetcode.reverseLinkedListII.ListNode;
//import leetcode.reverseLinkedListII.Solution;

//import leetcode.partitionList.ListNode;
//import leetcode.partitionList.Solution;

//import leetcode.removeDuplicatesfromSortedList.Solution;

//import leetcode.removeDuplicatesfromSortedListII.Solution;

//import leetcode.rotateList.Solution;

//import leetcode.removeNthNodeFromEndofList.Solution;

//import leetcode.swapNodesinPairs.Solution;

//import leetcode.reverseNodesinkGroup.Solution;

//import leetcode.linkedListCycle.Solution;

//import leetcode.linkedListCycleII.Solution;

//import leetcode.reorderList.Solution;

import java.util.Scanner;

import leetcode.LRUCache.LRUCache;

//import org.junit.Before;
import org.junit.Test;

public class TestLeetCode {
    String str;

    @Test
    public void test() {
        // Solution s = new Solution();
        LRUCache cache = new LRUCache(5);
        // SimpleNumber
        // int[] a = { 2, 4, 2, 4, 1, 6, 1, 7, 7, 3, 3, 9, 9, 44, 44, 6, 11, 5,
        // 5 };
        // Solution s = new Solution();
        // System.out.println(s.singleNumber(a));

        // TwoSum
        // int[] a = { 1, 2, 5, 6, 8, 10, 11, 12, 15 };
        // Solution s = new Solution();
        // int[] r = s.twoSum(a, 15);
        // System.out.println(r[0] + ":" + a[r[0] - 1] + "," + r[1] + ":" +
        // a[r[1] - 1]);

        // Remove Duplicates
        // int[] a = { 2, 1, 1, 1, 9, 7, 7, 4, 2, 4, 1, 6, 1, 7, 7, 3, 3, 9, 9,
        // 44, 44, 6, 11, 5, 5 };
        // printArray(a);
        // Arrays.sort(a);
        // printArray(a);
        // int n = Solution.removeDuplicates(a);
        // System.out.println(n + " : ");
        // printArray(a);

        // SearchInRotatedSortedArray
        // int[] a = { 5, 6, 7, 8, 9, 10, 11, 0, 1, 2, 3, 4 };
        // System.out.println(Solution.search(a, 4));

        // SearchInRotatedSortedArrayII
        // int[] a = { 5, 6, 6, 7, 7, 8, 9, 10, 11, 0, 1, 2, 3, 4 };
        // int[] a = { 3, 1 };
        // System.out.println(Solution.search(a, 18));

        // Median of Two Sorted Arrays
        // int[] A = new int[] { 1, 15 };
        // int[] B = new int[] { 1, 2, 3, 4 };
        // System.out.println(s.findMedianSortedArrays(A, B));

        // Longest Consecutive Sequence
        // int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 15, 16, 17, 0 };
        // System.out.println(s.longestConsecutive(a));

        // Merge Sorted Arrays
        // int[] a = { 0, 1, 2, 3, 4, 6, 8, 9, 0, 0, 0, 0, 0, 0 };
        // int[] b = { 2, 4, 7, 8, 13, 20 };
        // s.merge(a, 8, b, 6);
        // printArray(a);

        // 3 Sum
        // int[] a = { 0, 0, 8, 2, -1, 1, -10, 3, 4, -5, 0, 1, -3 };
        // int[] a = { 0, 0, 0 };
        // List<List<Integer>> res = s.threeSum(a);
        // for (List<Integer> l : res) {
        // System.out.print("[ ");
        // for (Integer i : l) {
        // System.out.print(i + " ");
        // }
        // System.out.print("]  ");
        //
        // }

        // 3 Sum Closest
        // int[] a = { -3, -2, -5, 3, -4 };// { 0, 0, 8, 2, -1, 1, -10, 3, 4,
        // -5,
        // // 0, 1,
        // // -3 };
        // System.out.println(s.threeSumClosest(a, -1));

        // 4 Sum
        // int[] a = { 0, 0, 0, 0 };// { 0, 0, 8, 2, -1, 1, -10, 3, 4, -5, 0, 1,
        // -3
        // // };
        // List<List<Integer>> result = s.fourSum(a, 0);
        // for (List<Integer> q : result) {
        // System.out.print("[ ");
        // for (Integer i : q) {
        // System.out.print(i + " ");
        // }
        // System.out.print("]  ");
        //
        // }

        // Remove Element
        // int[] a = { 1, 3, 5, 7, 9, 16, 18, 4, 6, 2, 3, 3, 3 };
        // System.out.println(s.removeElement(a, 3));
        // printArray(a);

        // Next Permutation
        // int[] a = { 1, 3, 2 };
        // s.nextPermutation(a);
        // printArray(a);

        // Pascal's Triangle II
        // List<Integer> list = s.getRowII(23);
        // for (int i : list) {
        // System.out.print(i + " ");
        // }

        // Permutation Sequence
        // System.out.println(s.getPermutationII(5, 7));
        // String str = "sosbppb";
        // System.out.println(s.longestPalindromeII(str));

        // Reverse words in a string
        // String str = "   a   b ";
        // System.out.println(s.reverseWords(str));

        // Valid Sudoku
        /*
         * char[][] board = {
         * { '5', '3', '2', '4', '7', '.', '.', '.', '.' },
         * { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
         * { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
         * { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
         * { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
         * { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
         * { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
         * { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
         * { '1', '.', '.', '.', '8', '.', '.', '7', '9' }, };
         * System.out.println(s.isValidSudoku(board));
         */

        // Trapping Rain Water
        // int[] a = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        // System.out.println(s.trap(a));

        // Climbing Stairs
        // System.out.println(s.climbStairs(3));

        // Gray Code
        // List<Integer> res = s.grayCode(8);
        // printArray(res);

        // Plus One
        // int[] d = { 1, 1, 1, 1, 2, 0, 9 };
        // printArray(s.plusOne(d));

        // Retate Image
        // int[][] matrix = //{{1,2},{3,4}};
        // {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // };
        // s.rotate(matrix);
        // printMatrix(matrix);

        // Set Matrix Zeroes
        // int[][] m = { { 0, 1 } };
        // s.setZeroes(m);
        // printMatrix(m);

        // SingleNumber II
        // int[] a = { 1, 1, 1, 5, 5, 5, 7, 7, 7, 12, 12, 12, 6, 6, 6, 4 };
        // System.out.println(s.singleNumber(a));

        // Reverse Linked List II
        // ListNode dummy = new ListNode(0), cur = dummy;
        //
        // for (int i = 0; i < 5; i++) {
        // cur.next = new ListNode(i + 1);
        // cur = cur.next;
        // }
        // printLinkedList(s.reverseBetween(dummy.next, 2, 4));

        // Partition List
        // ListNode dummy = new ListNode(0), cur = dummy;
        //
        // for (int i = 10; i > 0; i--) {
        // cur.next = new ListNode(i);
        // cur = cur.next;
        // }
        // printLinkedList(s.partition(dummy.next, 4));

        // Remove Duplicates from Sorted List
        // ListNode dummy = new ListNode(0), cur = dummy;
        // cur.next = new ListNode(1);
        // cur = cur.next;
        // cur.next = new ListNode(1);
        // cur = cur.next;
        // cur.next = new ListNode(1);
        // cur = cur.next;
        // cur.next = new ListNode(4);
        // cur = cur.next;
        // cur.next = new ListNode(5);
        // cur = cur.next;
        // cur.next = new ListNode(8);
        // cur = cur.next;
        // cur.next = new ListNode(8);
        // cur = cur.next;
        // cur.next = new ListNode(8);
        // cur = cur.next;
        // cur.next = new ListNode(10);
        // cur = cur.next;
        // cur.next = new ListNode(10);
        // cur = cur.next;
        // printLinkedList(s.deleteDuplicates(dummy));

        // Remove Duplicates from Sorted List II
        // ListNode dummy = new ListNode(0), cur = dummy;
        // cur.next = new ListNode(1);
        // cur = cur.next;
        // cur.next = new ListNode(1);
        // cur = cur.next;
        // cur.next = new ListNode(1);
        // cur = cur.next;
        // cur.next = new ListNode(4);
        // cur = cur.next;
        // cur.next = new ListNode(5);
        // cur = cur.next;
        // cur.next = new ListNode(6);
        // cur = cur.next;
        // cur.next = new ListNode(8);
        // cur = cur.next;
        // cur.next = new ListNode(8);
        // cur = cur.next;
        // cur.next = new ListNode(8);
        // cur = cur.next;
        // cur.next = new ListNode(9);
        // cur = cur.next;
        // cur.next = new ListNode(10);
        // cur = cur.next;
        // cur.next = new ListNode(10);
        // cur = cur.next;
        // printLinkedList(s.deleteDuplicates(dummy));

        // Rotate List
        // ListNode dummy = new ListNode(1), cur = dummy;
        // cur.next = new ListNode(2);
        // cur = cur.next;
        // cur.next = new ListNode(3);
        // cur = cur.next;
        // cur.next = new ListNode(4);
        // cur = cur.next;
        // cur.next = new ListNode(5);
        // printLinkedList(s.rotateRight(dummy, 2));

        // Remove Nth Node From End of List
        // ListNode dummy = new ListNode(1), cur = dummy;
        // cur.next = new ListNode(2);
        // cur = cur.next;
        // cur.next = new ListNode(3);
        // cur = cur.next;
        // cur.next = new ListNode(4);
        // cur = cur.next;
        // cur.next = new ListNode(5);
        // printLinkedList(s.removeNthFromEnd(dummy, 0));
        // printLinkedList(s.removeNthFromEnd(dummy, 1));

        // Swap Nodes in Pairs
        // ListNode dummy = new ListNode(1), cur = dummy;
        // cur.next = new ListNode(2);
        // cur = cur.next;
        // cur.next = new ListNode(3);
        // cur = cur.next;
        // cur.next = new ListNode(4);
        // cur = cur.next;
        // cur.next = new ListNode(5);
        // cur = cur.next;
        // cur.next = new ListNode(6);
        // printLinkedList(s.swapPairs(dummy));

        // Reverse Nodes in k-Group
        // ListNode dummy = new ListNode(1), cur = dummy;
        // cur.next = new ListNode(2);
        // cur = cur.next;
        // cur.next = new ListNode(3);
        // cur = cur.next;
        // cur.next = new ListNode(4);
        // cur = cur.next;
        // cur.next = new ListNode(5);
        // cur = cur.next;
        // cur.next = new ListNode(6);
        // printLinkedList(s.reverseKGroup(dummy, 4));

        // Reverse Nodes in k-Group
        // ListNode dummy = new ListNode(1), cur = dummy;
        // cur.next = new ListNode(2);
        // cur = cur.next;
        // cur.next = new ListNode(3);
        // cur = cur.next;
        // cur.next = new ListNode(4);
        // cur = cur.next;
        // cur.next = new ListNode(5);
        // cur = cur.next;
        // cur.next = new ListNode(6);
        // cur = cur.next;
        // cur.next = new ListNode(7);
        // cur = cur.next;
        // ListNode ins = cur;
        // cur.next = new ListNode(8);
        // cur = cur.next;
        // cur.next = new ListNode(9);
        // cur = cur.next;
        // cur.next = ins;
        // System.out.println(s.detectCycle(dummy).val);

        // Reverse Nodes in k-Group
        // ListNode dummy = new ListNode(1), cur = dummy;
        // cur.next = new ListNode(2);
        // cur = cur.next;
        // cur.next = new ListNode(3);
        // cur = cur.next;
        // cur.next = new ListNode(4);
        // cur = cur.next;
        // cur.next = new ListNode(5);
        // cur = cur.next;
        // cur.next = new ListNode(6);
        // cur = cur.next;
        // cur.next = new ListNode(7);
        // cur = cur.next;
        // cur.next = new ListNode(8);
        // cur = cur.next;
        // cur.next = new ListNode(9);
        // cur = cur.next;
        // cur.next = new ListNode(10);
        // s.reorderList(dummy);
        // printLinkedList(dummy);

        // LRUCache
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int key = sc.nextInt();
            if (key == -1) break;
            int value = sc.nextInt();
            cache.set(key, value);
            cache.show();
            if ((key = sc.nextInt()) != -1) {
                System.out.println(cache.get(key));
                cache.show();
            }
        }
        sc.close();
    }

    // private void printMatrix(int[][] matrix) {
    // int N = matrix.length;
    // for (int i = 0; i < N; i++)
    // printArray(matrix[i]);
    // }

    // @Before
    // public void prePro() throws IOException {
    // BufferedReader br = new BufferedReader(new FileReader("data.txt"));
    // str = br.readLine();
    // br.close();
    // }

    // private void printArray(Iterable<Integer> a) {
    // for (Integer i : a) {
    // System.out.print(i + " ");
    // }
    // System.out.println();
    // }
    //
    // private void printArray(int[] a) {
    // for (int i : a) {
    // System.out.print(i + " ");
    // }
    // System.out.println();
    // }
    //
    // private void printLinkedList(ListNode r) {
    // while (r != null) {
    // System.out.print(r.val);
    // if (r.next != null) System.out.print("->");
    // r = r.next;
    // }
    // System.out.println();
    // }
}
