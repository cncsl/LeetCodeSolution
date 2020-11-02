/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根到叶子节点数字之和
 */

// @lc code=start

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
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root, 0);
    }

    private int helper(TreeNode node, int sum) {
        // 包含node结点在内的结点序列构成的数
        int cursum = sum * 10 + node.val;
        // 叶子结点直接返回
        if (node.left == null && node.right == null) {
            return cursum;
        }
        int result = 0;
        // node 结点左子树构成的数
        if (node.left != null) {
            result += helper(node.left, cursum);
        }
        // node 结点右子树构成的数
        if (node.right != null) {
            result += helper(node.right, cursum);
        }
        // node 结点下左右子树构成的数的和
        return result;
    }
}
// @lc code=end
