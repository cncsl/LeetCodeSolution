import java.util.Stack;
/*
 * @lc app=leetcode.cn id=783 lang=java
 *
 * [783] 二叉搜索树结点最小距离
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    public int minDiffInBST(TreeNode root) {
        int minDiff = Integer.MAX_VALUE;
        Integer prevVal = null;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            // 遍历序列的第一个值
            if (prevVal != null) {
                minDiff = Math.min(node.val - prevVal, minDiff);
            }
            prevVal = node.val;
            node = node.right;
        }
        return minDiff;
    }
}
// @lc code=end
