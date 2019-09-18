import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        LinkedList<TreeNode> nodeStack = new LinkedList<>();
        if (root == null)
            return result;

        TreeNode node = root;
        while (node != null || !nodeStack.isEmpty()) {
            while(node != null){
                result.add(node.val);
                nodeStack.push(node);
                node = node.left;
            }
            node = nodeStack.pop();
            node = node.right;
        }
        return result;
    }

    // 递归调用
    // private void helper(TreeNode root, List<Integer> list){
    // if(root != null){
    // list.add(root.val);
    // helper(root.left, list);
    // helper(root.right, list);
    // }
    // }
}
