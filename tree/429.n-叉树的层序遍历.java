/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N 叉树的层序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        //待遍历的下一行
        Queue<Node> nextLevel = new LinkedList<>();
        nextLevel.add(root);
        while (!nextLevel.isEmpty()) {
            List<Integer> values = new ArrayList();
            int size = nextLevel.size();
            for (int i = 0; i < size; i++) {
                root = nextLevel.poll();
                values.add(root.val);
                nextLevel.addAll(root.children);
            }
            result.add(values);
        }
        return result;
    }
}
// @lc code=end

