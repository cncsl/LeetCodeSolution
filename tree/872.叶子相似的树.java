/*
 * @lc app=leetcode.cn id=872 lang=java
 *
 * [872] 叶子相似的树
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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> firstValues = new ArrayList<>();
        List<Integer> secondValues = new ArrayList<>();

        function(root1, firstValues);
        function(root2, secondValues);
        
        return firstValues.equals(secondValues);
    }

    /**
     * 遍历二叉树，将叶子结点的值放入指定容器
     */
    public void function(TreeNode root, List<Integer> leaves) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leaves.add(root.val);
            return;
        }
        function(root.left, leaves);
        function(root.right, leaves);
    }
}
// @lc code=end

