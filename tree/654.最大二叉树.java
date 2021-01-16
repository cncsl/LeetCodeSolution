/*
 * @lc app=leetcode.cn id=654 lang=java
 *
 * [654] 最大二叉树
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
     * 根据题目描述的规则构建二叉树
     *
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    /**
     * 从数组 num 的 start 到 end 的元素构建二叉树
     * 
     * @param nums 数组
     * @param start 从 start 位置开始
     * @param end 从 end 截止（不包括 end）
     */
    private TreeNode constructMaximumBinaryTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = constructMaximumBinaryTree(nums, start, maxIndex - 1);
        root.right = constructMaximumBinaryTree(nums, maxIndex + 1, end);
        return root;
    }

}
// @lc code=end

