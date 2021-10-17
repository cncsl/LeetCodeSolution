/*
 * @lc app=leetcode.cn id=230 lang=java
 *
 * [230] 二叉搜索树中第K小的元素
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    /**
     * BST中序遍历结果为升序序列，该序列的第 K 个就是结果
     */
    public int kthSmallest(TreeNode root, int k) {
        if (root == null)
            return 0;

        int result = 0;
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.addFirst(node);
                node = node.left;
            }
            node = stack.removeFirst();
            // 保存结果、结束循环
            if (--k == 0) {
                result = node.val;
                break;
            }
            node = node.right;
        }
        return result;
    }
}
