/*
 * @lc app=leetcode.cn id=117 lang=java
 *
 * [117] 填充每个节点的下一个右侧节点指针 II
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        Node node = root;
        while (node != null) {
            // 当前结点为叶子结点，寻找到当前层下一个非叶子结点
            while (node != null && node.left == null && node.right == null)
                node = node.next;
            // 如果成立表示所有结点均已访问
            if (node == null)
                break;

            // 遍历当前层
            Node cur = null;
            for (Node i = node; i != null; i = i.next) {
                if (i.left != null) {
                    if (cur != null)
                        cur.next = i.left;
                    cur = i.left;
                }
                if (i.right != null) {
                    if (cur != null)
                        cur.next = i.right;
                    cur = i.right;
                }
            }
            // 更新队首（node 确定为非叶子结点）
            node = node.left != null ? node.left : node.right;
        }
        return root;
    }
}
