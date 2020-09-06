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
        if (head == null || head.next == null) {
            return head;
        }
        ListNode vHead = new ListNode(-1);
        vHead.next = head;
        ListNode slow = vHead;
        ListNode fast = head;

        while (fast != null) {
            if ((fast.next != null && fast.val != fast.next.val) || fast.next == null) {
                if (slow.next == fast) {
                    slow = fast;
                } else {
                    // slow 是重复元素的前一个（slow自身不是）
                    // fast 是重复元素的最后一个（fast自身也是）
                    slow.next = fast;
                }
            }
            fast = fast.next;
        }
        return vHead.next;
    }
}
