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
        //有可能在头节点前插入  所以用一个 virtHead
        ListNode virtHead = new ListNode(0);
        ListNode prev = virtHead;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmp = curr.next;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }
            curr.next = prev.next;
            prev.next = curr;
            prev = virtHead;
            curr = tmp;
        }
        return virtHead.next;
    }
}
// @lc code=end
