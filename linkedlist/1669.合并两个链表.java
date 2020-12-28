/*
 * @lc app=leetcode.cn id=1669 lang=java
 *
 * [1669] 合并两个链表
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
    /**
     * 删除 list1 中从 a 到 b 的节点，把 list2 放进去，链表节点从 0 开始计数
     */
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = list1;
        while (a-- > 1 && start.next != null) {
            start = start.next;
        }
        start.next = list2;

        ListNode end = start;
        int len = b - a;
        while (len-- > 1 && end.next != null) {
            end = end.next;
        }
        while (list2.next != null) {
            list2 = list2.next;
        } 
        list2.next = end;
        
        return list1;
    }
}
// @lc code=end

