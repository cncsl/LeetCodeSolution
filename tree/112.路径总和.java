/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;

        //叶子结点
        if (root.left == null && root.right == null && root.val == sum)
            return true;
        //遍历到叶子结点
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}

