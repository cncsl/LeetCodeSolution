/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode vhead = new ListNode(0);
        vhead.next = head;
        //用index遍历链表
        ListNode index = vhead;
        while (index.next != null) {
            if (index.next.val == val) {
                //删除的是 index.next
                index.next = index.next.next;
            } else {
                index = index.next;
            }
        }
        return vhead.next;
    }
}
// @lc code=end
