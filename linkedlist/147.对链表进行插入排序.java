/*
 * @lc app=leetcode.cn id=147 lang=java
 *
 * [147] 对链表进行插入排序
 */

// @lc code=start

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode vHead = new ListNode(-1);
        ListNode index = head;
        while (index != null) {
            //prev 每次从头部开始遍历找到插入位置（它是插入位置的前一个节点）
            ListNode prev = vHead;
            //temp 用于记录下一个索引值
            ListNode temp = index.next;
            while (prev.next != null && prev.next.val < index.val) {
                prev = prev.next;
            }
            index.next = prev.next;
            prev.next = index;
            index = temp;
        }
        return vHead.next;
    }
}
// @lc code=end
