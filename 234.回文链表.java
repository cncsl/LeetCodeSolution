/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) {
            return true;
        }
        
        //快慢指针找链表中点，退出循环时 slower 指向中间
        ListNode faster = head;
        ListNode slower = head;
        while(faster != null && faster.next != null) {
            faster = faster.next.next;
            slower = slower.next;
        }

        //翻转后半部分链表
        ListNode tail = null;
        while(slower != null) {
            ListNode temp = slower.next;
            slower.next = tail;
            tail = slower;
            slower = temp;
        }
        
        while(head != null) {
            if(head.val != tail.val) {
                return false;
            }
            head = head.next;
            tail = tail.next;
        }

        return true;
    }
}
// @lc code=end

