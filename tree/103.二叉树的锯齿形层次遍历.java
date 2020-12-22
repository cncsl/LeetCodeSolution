/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层次遍历
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //left to right
        boolean ltr = true;
        while (!queue.isEmpty()) {
            //双端队列，lft 为 true 时用 offerLast，反之用 offerFirst
            Deque<Integer> level = new ArrayDeque<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                root = queue.poll();
                if (ltr) {
                    level.offerLast(root.val);
                } else {
                    level.offerFirst(root.val);
                }

                if (root.left != null) {
                    queue.offer(root.left);
                }
                if (root.right != null) {
                    queue.offer(root.right);
                }
            }

            result.add(new LinkedList<Integer>(level));
            ltr = !ltr;
        }
        return result;
    }
}
