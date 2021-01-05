/*
 * @lc app=leetcode.cn id=572 lang=java
 *
 * [572] 另一个树的子树
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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        //经过上方判断后，下方条件为真时 s 或者 t 有且仅有一个为 null
        if (s == null || t == null) {
            return false;
        }
        if(s.val == t.val) {
            return isSameTree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
        }
        // 根节点不同时不用考虑 s 和 t 是同一棵树的情况
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        //经过上方判断后，下方条件为真时 s 或者 t 有且仅有一个为 null
        if (s == null || t == null) {
            return false;
        }
        return s.val == t.val && isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}
// @lc code=end

