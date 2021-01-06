/*
 * @lc app=leetcode.cn id=938 lang=java
 *
 * [938] 二叉搜索树的范围和
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
     * 计算二叉搜索树一个区间内所有节点值的和
     * 
     * @param root 二叉搜索树根节点
     * @param low 区间起始值
     * @param high 区间结束值
     * @return low 和 high 区间内所有节点值的和
     */
    public int rangeSumBST(TreeNode root, int low, int high) {
        Deque<TreeNode> deque = new LinkedList<>();
        int result = 0;
        TreeNode node = root;
        while (node != null || !deque.isEmpty()) {
            while (node != null) {
                deque.addFirst(node);
                node = node.left;
            }
            node = deque.removeFirst();
            if (node.val >= low) {
                if (node.val > high) {
                    break;
                }
                result += node.val;
            }
            node = node.right;
        }
        return result;
    }
}
// @lc code=end

