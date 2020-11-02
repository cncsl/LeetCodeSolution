/*
 * @lc app=leetcode.cn id=116 lang=java
 *
 * [116] 填充每个节点的下一个右侧节点指针
 */
/*
 * // Definition for a Node. class Node { public int val; public Node left; public Node right;
 * public Node next;
 *
 * public Node() {}
 *
 * public Node(int _val,Node _left,Node _right,Node _next) { val = _val; left = _left; right =
 * _right; next = _next; } };
 */
class Solution {
    public Node connect(Node root) {
        if (root == null)
            return null;

        Queue<Node> nodeQ = new LinkedList<>();
        nodeQ.add(root);

        // 每一层的结点个数
        int len;
        // 每一层的从左往右数第一个结点
        Node node = null;
        while (!nodeQ.isEmpty()) {
            len = nodeQ.size();
            for (int i = 0; i < len; i++) {
                node = nodeQ.poll();

                if (i != len - 1) {
                    node.next = nodeQ.peek();
                }
                if (node.left != null)
                    nodeQ.offer(node.left);
                if (node.right != null)
                    nodeQ.offer(node.right);
            }
        }
        return root;
    }
}
