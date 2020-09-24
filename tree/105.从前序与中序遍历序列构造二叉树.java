/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    // 使用哈希表保证从中序遍历序列中查找root结点值时的效率
    private HashMap<Integer, Integer> inOrderMap = new HashMap<>();
    private int[] preOrder;
    private int preIndex;

    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        // 初始化成员变量
        this.preOrder = preOrder;
        preIndex = 0;
        // 构建哈希表
        int id = 0;
        for (Integer val : inOrder) {
            inOrderMap.put(val, id++);
        }

        return helper(0, inOrder.length);
    }

    // 在中序遍历序列中的首尾位置
    public TreeNode helper(int left, int right) {
        if (left == right)
            return null;

        int rootVal = preOrder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        // 查询 rootVal 在中序遍历序列中的位置，以 inIndex 值对中序遍历序列截断
        // inIndex 之前的构成当前结点的左子树，之后的构成当前结点的右子树
        int inIndex = inOrderMap.get(rootVal);

        root.left = helper(left, inIndex);
        root.right = helper(inIndex + 1, right);

        return root;
    }
}
