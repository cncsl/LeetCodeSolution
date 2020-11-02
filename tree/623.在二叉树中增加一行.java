/*
 * @lc app=leetcode.cn id=623 lang=java
 *
 * [623] 在二叉树中增加一行
 */

// @lc code=start

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode n = new TreeNode(v);
            n.left = root;
            return n;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //记录当前行
        int depth = 1;
        //题目对用例的限制保证了 level < d - 1 成立时 queue 一定不为空
        while (depth < d - 1) {
            int num = queue.size();
            for (int i = 0; i < num; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
            //行数加一
            depth++;
        }

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            //左
            TreeNode temp = node.left;
            node.left = new TreeNode(v);
            node.left.left = temp;
            //右
            temp = node.right;
            node.right = new TreeNode(v);
            node.right.right = temp;
        }
        return root;
    }
}
// @lc code=end

