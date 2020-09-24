/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        TreeNode prev = null;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.add(node);
                node = node.left;
            }
            node = stack.peek();
            // 无右子节点或右子节点已访问过时才访问根节点
            if (node.right == null || prev == node.right) {
                stack.pop();
                result.add(node.val);
                prev = node;
                node = null;
            } else {
                node = node.right;
                prev = null;
            }
        }
        return result;
    }

    // public void helper(TreeNode root, List<Integer> list){
    // if(root != null){
    // helper(root.left, list);
    // helper(root.right, list);
    // list.add(root.val);
    // }
    // }
}
