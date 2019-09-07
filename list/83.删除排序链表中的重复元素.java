/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prevNode = head;
        ListNode currNode = head.next;
        while (currNode != null) {
            if (prevNode.val == currNode.val) {
                prevNode.next = currNode.next;
                currNode = currNode.next;
            } else {
                prevNode = prevNode.next;
                currNode = currNode.next;
            }
        }
        return head;
    }
}
