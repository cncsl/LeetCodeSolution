/*
 * @lc app=leetcode.cn id=1110 lang=java
 *
 * [1110] 删点成林
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<TreeNode> res = new ArrayList<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> hashset = new HashSet<>();
        for (int i : to_delete) {
            hashset.add(i);
        }
        if (!hashset.contains(root.val)) {
            res.add(root);
        }
        DFS(root, hashset);
        return res;
    }

    public TreeNode DFS(TreeNode root, Set<Integer> hashset) {
        if (root == null) {
            return null;
        }
        root.left = DFS(root.left, hashset);
        root.right = DFS(root.right, hashset);
        if (hashset.contains(root.val)) {
            if (root.left != null) {res.add(root.left);}
            if (root.right != null) {res.add(root.right);}
            root = null;
        }
        return root;
    }
}
// @lc code=end

