/*
 * @lc app=leetcode.cn id=222 lang=java
 *
 * [222] 完全二叉树的节点个数
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return 1;
        }
        // 二叉树的深度
        int depth = 1;
        TreeNode node = root;
        while (node.left != null) {
            depth++;
            node = node.left;
        }
        // 对最后一层进行二分搜索
        int left = 0, right = (int) Math.pow(2, depth - 1) - 1;
        int pivot;
        while (left <= right) {
            pivot = (left + right) >> 1;
            if (exists(pivot, depth - 1, root)) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        // 前 depth - 1 层是满二叉树
        return (int) Math.pow(2, depth - 1) - 1 + left;
    }

    public boolean exists(int idx, int d, TreeNode node) {
        int left = 0, right = (int) Math.pow(2, d) - 1;
        int pivot;
        for (int i = 0; i < d; ++i) {
            pivot = left + (right - left) / 2;
            if (idx <= pivot) {
                node = node.left;
                right = pivot;
            } else {
                node = node.right;
                left = pivot + 1;
            }
        }
        return node != null;
    }

}
// @lc code=end
