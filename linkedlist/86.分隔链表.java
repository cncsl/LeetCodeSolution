/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
 */

// @lc code=start

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {

        // bHead(before head) 是哑节点
        ListNode bHead = new ListNode(0);
        ListNode before = bHead;
        ListNode aHead = new ListNode(0);
        ListNode after = aHead;

        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        //避免出现环
        after.next = null;

        before.next = aHead.next;
        return bHead.next;
    }
}
// @lc code=end
