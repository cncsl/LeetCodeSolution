/**
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.addFirst(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                root = deque.removeLast();
                level.add(root.val);
                if (root.left != null) {
                    deque.addFirst(root.left);
                }
                if (root.right != null) {
                    deque.addFirst(root.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}