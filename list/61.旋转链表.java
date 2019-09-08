/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;

        // 先把链表结成环
        ListNode currNode = head;
        int n = 1;
        while (currNode.next != null) {
            currNode = currNode.next;
            n++;
        }
        currNode.next = head;
        
        // 找到拆分处
        ListNode prevNode = head;
        for (int i = 0; i < n - k % n -1; i++)
            prevNode = prevNode.next;

        // 拆分处右侧第一个结点是新的头结点
        ListNode newHead = prevNode.next;
        prevNode.next = null;

        return newHead;
    }
}
