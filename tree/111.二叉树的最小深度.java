import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        // 只有根节点的情况深度为 1
        int result = 1;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);

        TreeNode node = null;
        first: while (!nodeQueue.isEmpty()) {
            int num = nodeQueue.size();
            for (int i = 0; i < num; i++) {
                node = nodeQueue.poll();
                if (node.left == null && node.right == null)
                    break first;
                if(node.left != null)
                    nodeQueue.offer(node.left);
                if(node.right != null)
                    nodeQueue.offer(node.right);
            }
            result++;
        }
        return result;
    }
}
