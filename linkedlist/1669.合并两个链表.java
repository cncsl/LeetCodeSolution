/*
 * @lc app=leetcode.cn id=1669 lang=java
 *
 * [1669] 合并两个链表
 */

// @lc code=start

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    /**
     * 删除 list1 中从 a 到 b 的节点，把 list2 放进去，链表节点从 0 开始计数
     */
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        //找到 list2 的插入位置
        //start 是插入位置的前一个节点，方便 start.next = list2
        //end 是插入位置的后一个节点，方便 list2.next = end
        ListNode start = list1;
        ListNode end = list1;
        while (a-- > 1) {
            start = start.next;
        }
        while (b-- > -1) {
            end = end.next;
        }
        start.next = list2;
        //list2 的结尾
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = end;

        return list1;
    }
}
// @lc code=end

