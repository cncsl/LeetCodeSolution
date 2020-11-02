/*
 * @lc app=leetcode.cn id=106 lang=java
 *
 * [106] 从中序与后序遍历序列构造二叉树
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    // 使用HashMap保存中序遍历序列，提高查找效率
    private HashMap<Integer, Integer> inOrderMap = new HashMap<>();
    // 使用成员变量保存后续遍历序列
    private int[] postorder;
    private int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        postIndex = postorder.length - 1;

        int id = 0;
        for (Integer val : inorder)
            inOrderMap.put(val, id++);

        return helper(0, inorder.length);
    }

    private TreeNode helper(int left, int right) {
        if (left == right)
            return null;

        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);

        int index = inOrderMap.get(rootVal);
        root.right = helper(index + 1, right);
        root.left = helper(left, index);

        return root;
    }
}
