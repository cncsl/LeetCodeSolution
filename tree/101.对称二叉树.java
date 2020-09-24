/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        nodeQueue.add(root);

        TreeNode left;
        TreeNode right;
        while (!nodeQueue.isEmpty()) {
            left = nodeQueue.poll();
            right = nodeQueue.poll();

            if (left == null && right == null)
                continue;

            if (left == null || right == null)
                return false;

            if (left.val != right.val)
                return false;

            nodeQueue.add(left.left);
            nodeQueue.add(right.right);
            nodeQueue.add(left.right);
            nodeQueue.add(right.left);
        }
        return true;
    }
}
