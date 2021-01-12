/**
 * https://leetcode-cn.com/problems/successor-lcci/
 * <p>
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Deque<TreeNode> nodeStack = new LinkedList<>();
        boolean findPrevious = false;
        while (root != null || !nodeStack.isEmpty()) {
            while (root != null) {
                nodeStack.addFirst(root);
                root = root.left;
            }
            root = nodeStack.removeFirst();
            if (findPrevious) {
                return root;
            }
            if (root.val == p.val) {
                findPrevious = true;
            }
            root = root.right;
        }
        return null;
    }
}