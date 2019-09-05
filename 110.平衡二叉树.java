/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        // 空树也是树
        if (root == null)
            return true;

        return Math.abs(treeHeight(root.left) - treeHeight(root.right)) <= 1 && isBalanced(root.left)
                && isBalanced(root.right);
    }

    private int treeHeight(TreeNode root) {
        int leftH, rightH;
        if (root == null)
            return 0;

        leftH = treeHeight(root.left);
        rightH = treeHeight(root.right);
        return leftH > rightH ? leftH + 1 : rightH + 1;
    }
}
