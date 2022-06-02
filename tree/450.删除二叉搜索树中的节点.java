/*
 * @lc app=leetcode.cn id=450 lang=java
 *
 * [450] 删除二叉搜索树中的节点
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val == key) {
            //如果待删除节点是叶子结点，直接返回 null 即可
            if (root.left == null && root.right == null) {
                return null;
            }
            //如果左子树未空，直接返回右子树（下同）
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            //
            TreeNode node = root.right;
            while (node.left != null) {
                node = node.left;
            }
            root.right = deleteNode(root.right, node.val);
            node.right = root.right;
            node.left = root.left;
            root = node;
        }
        return root;
    }
}
// @lc code=end

