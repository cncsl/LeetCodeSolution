/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        // 不依赖索引的顺序访问、频繁的插入删除，故选择链表实现
        Queue<TreeNode> nodeQ = new LinkedList<>();
        nodeQ.offer(root);

        TreeNode node = null;
        int count;
        while (!nodeQ.isEmpty()) {
            count = nodeQ.size();

            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                node = nodeQ.poll();
                level.add(node.val);

                if (node.left != null)
                    nodeQ.offer(node.left);
                if (node.right != null)
                    nodeQ.offer(node.right);
            }
            result.add(level);
        }
        Collections.reverse(result);
        return result;
    }
}
