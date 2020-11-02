/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层次遍历
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Stack<TreeNode> currLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();
        currLevel.push(root);

        boolean ltr = true; // left to right
        TreeNode node = null;
        List<Integer> level = new ArrayList<>();
        while (!currLevel.isEmpty()) {
            node = currLevel.pop();
            level.add(node.val);
            if (ltr) {
                if (node.left != null)
                    nextLevel.push(node.left);
                if (node.right != null)
                    nextLevel.push(node.right);
            } else {
                if (node.right != null)
                    nextLevel.push(node.right);
                if (node.left != null)
                    nextLevel.push(node.left);
            }
            // 完成了一层遍历
            if (currLevel.isEmpty()) {
                // 将存储一层所有结果的 List 存入 result
                result.add(level);
                level = new ArrayList<>();
                // 标志改变
                ltr = !ltr;
                // 交换两个栈的引用
                Stack<TreeNode> temp = currLevel;
                currLevel = nextLevel;
                nextLevel = temp;
            }
        }
        return result;
    }
}
