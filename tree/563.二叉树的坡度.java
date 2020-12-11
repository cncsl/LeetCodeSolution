/*
 * @lc app=leetcode.cn id=563 lang=java
 *
 * [563] 二叉树的坡度
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    /**
     * 求二叉树整个树的坡度
     *
     * 
     */
    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return findTilt(root.left) + findTilt(root.right) + recurseCountOneTilt(root);
    }

    /**
     * 求一个二叉树的坡度
     * 
     * @param root 二叉树根节点
     * @return 二叉树坡度
     */
    private int recurseCountOneTilt(TreeNode root) {
        //空树坡度为 0
        if (root == null) {
            return 0;
        }
        return Math.abs(recurseCountSum(root.left) - recurseCountSum(root.right));
    }

    /**
     * 求一个二叉树节点之和
     * 
     * @param root 二叉树根节点
     * @return 二叉节点之和
     */
    private int recurseCountSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val + recurseCountSum(root.left) + recurseCountSum(root.right);
    }
}
// @lc code=end

