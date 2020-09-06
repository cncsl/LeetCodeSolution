/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层次遍历
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        TreeNode currNode;
        while (!queue.isEmpty()) {
            List<Integer> temp = new LinkedList<>();

            int num = queue.size();
            for (int i = 0; i < num; i++) {
                currNode = queue.poll();
                temp.add(currNode.val);
                if (currNode.left != null)
                    queue.add(currNode.left);
                if (currNode.right != null)
                    queue.add(currNode.right);
            }
            result.add(temp);
        }

        return result;
    }
}
