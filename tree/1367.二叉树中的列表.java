/*
 * @lc app=leetcode.cn id=1367 lang=java
 *
 * [1367] 二叉树中的列表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return head == null;
        }
        return dfsCheckSubPath(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean dfsCheckSubPath(ListNode head, TreeNode root) {
        //链表全部匹配完表示匹配成功
        if (head == null) {
            return true;
        }
        //树匹配到了空节点表示匹配失败
        if (root == null) {
            return false;
        }
        if (head.val != root.val) {
            return false;
        }
        return dfsCheckSubPath(head.next, root.left) || dfsCheckSubPath(head.next, root.right);
    }

}
// @lc code=end

