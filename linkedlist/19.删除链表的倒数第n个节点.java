/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第N个节点
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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode faster = head;
        while(n-- > 0) {
            faster = faster.next;
        } 

        if(faster == null) {
            return head.next;
        }
        ListNode slower = head;
        while(faster.next != null) {
            faster = faster.next;
            slower = slower.next;
        }
        slower.next = slower.next.next;
        return head;
    }
}
// @lc code=end

