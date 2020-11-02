/*
 * @lc app=leetcode.cn id=235 lang=java
 *
 * [235] 二叉搜索树的最近公共祖先
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //题目中没有保证 p 小于 q，但是测试用例里好像没有这种情况？
        if (p.val > q.val) {
            TreeNode temp = p;
            p = q;
            q = temp;
        }

        if (root == null || root == p || root == q)
            return root;

        if (root.val > p.val && root.val < q.val)
            return root;

        if (p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        else //只剩下 p、q 在 root 右子树中的情况
            return lowestCommonAncestor(root.right, p, q);
    }
}

