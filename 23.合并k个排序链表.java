/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个排序链表
 *
 * https://leetcode-cn.com/problems/merge-k-sorted-lists/description/
 *
 * algorithms
 * Hard (44.49%)
 * Likes:    264
 * Dislikes: 0
 * Total Accepted:    28.1K
 * Total Submissions: 60.2K
 * Testcase Example:  '[[1,4,5],[1,3,4],[2,6]]'
 *
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * 
 * 示例:
 * 
 * 输入:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 * 
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        ListNode temp = lists[0];

        for (int i = 1; i < lists.length; i++) {
            temp = mergeTwoLists(temp, lists[i]);
        }
        return temp;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode tempOne = l1;
        ListNode tempTwo = l2;

        ListNode resultNode = new ListNode(0);
        ListNode temp = resultNode;

        while (tempOne != null && tempTwo != null) {
            if (tempOne.val < tempTwo.val) {
                temp.next = tempOne;
                temp = temp.next;
                tempOne = tempOne.next;
            } else {
                temp.next = tempTwo;
                temp = temp.next;
                tempTwo = tempTwo.next;
            }
        }

        temp.next = tempOne == null ? tempTwo : tempOne;
        return resultNode.next;
    }
}
