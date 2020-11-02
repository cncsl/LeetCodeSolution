/*
 * @lc app=leetcode.cn id=617 lang=java
 *
 * [617] 合并二叉树
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }

        TreeNode root = new TreeNode(t1.val + t2.val);
        Queue<TreeNode> queueResult = new LinkedList<>();
        Queue<TreeNode> queueOne = new LinkedList<>();
        Queue<TreeNode> queueTwo = new LinkedList<>();
        queueResult.offer(root);
        queueOne.offer(t1);
        queueTwo.offer(t2);

        while (!queueOne.isEmpty() && !queueTwo.isEmpty()) {
            TreeNode node = queueResult.poll(), one = queueOne.poll(), two = queueTwo.poll();
            if (one.left != null || two.left != null) {
                if (one.left != null && two.left != null) {
                    TreeNode left = new TreeNode(one.left.val + two.left.val);
                    node.left = left;
                    queueResult.offer(left);
                    queueOne.offer(one.left);
                    queueTwo.offer(two.left);
                } else if (one.left != null) {
                    node.left = new TreeNode(one.left.val);
                } else if (two.left != null) {
                    node.left = new TreeNode(two.left.val);
                }
            }
            if (one.right != null || two.right != null) {
                if (one.right != null && two.right != null) {
                    TreeNode right = new TreeNode(one.right.val + two.right.val);
                    node.right = right;
                    queueResult.offer(right);
                    queueOne.offer(one.right);
                    queueTwo.offer(two.right);
                } else if (one.right != null) {
                    node.right = new TreeNode(two.right.val);
                } else {
                    node.right = new TreeNode(two.right.val);
                }
            }
        }
        return root;
    }

    // public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    // if (t1 == null)
    // return t2;
    // if (t2 == null)
    // return t1;
    // t1.val += t2.val;

    // t1.left = mergeTrees(t1.left, t2.left);
    // t1.right = mergeTrees(t1.right, t2.right);

    // return t1;
    // }
}
