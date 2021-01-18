/*
 * @lc app=leetcode.cn id=1008 lang=java
 *
 * [1008] 前序遍历构造二叉搜索树
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
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder, 0, preorder.length - 1);
    }

    private TreeNode bstFromPreorder(int[] preorder, int start, int end) {
        if (start > end) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[start]);
        int index = start + 1;
        while (index <= end && preorder[index] < preorder[start]) {
            index++;
        }
        root.left = bstFromPreorder(preorder, start + 1, index - 1);
        root.right = bstFromPreorder(preorder, index, end);
        return root;
    }
}
// @lc code=end

