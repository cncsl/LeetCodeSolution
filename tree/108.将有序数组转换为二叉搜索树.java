/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int[] nums;

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;

        this.nums = nums;

        return helper(0, nums.length - 1);
    }

    private TreeNode helper(int start, int end) {
        if (start > end)
            return null;

        int halfIndex = start + end >>> 1;
        TreeNode root = new TreeNode(nums[halfIndex]);

        root.left = helper(start, halfIndex - 1);
        root.right = helper(halfIndex + 1, end);

        return root;
    }
}

