import java.util.Stack;

/*
 * @lc app=leetcode.cn id=99 lang=java
 *
 * [99] 恢复二叉搜索树
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public void recoverTree(TreeNode root) {
        Stack<TreeNode> nodeStack = new Stack<>();

        Long prevVal = Long.MIN_VALUE;

        TreeNode currNode = root;
        TreeNode prevNode = null;

        // 记录出错的两个结点的位置
        TreeNode tragetNodeOne = null;
        TreeNode tragetNodeTwo = null;

        while (currNode != null || !nodeStack.empty()) {
            while (currNode != null) {
                nodeStack.push(currNode);
                currNode = currNode.left;
            }

            currNode = nodeStack.pop();

            if (currNode.val <= prevVal) {
                if (prevNode == null) {
                    
                }
            }

            prevVal = Long.valueOf(currNode.val);
            currNode = currNode.right;
        }
    }
}
