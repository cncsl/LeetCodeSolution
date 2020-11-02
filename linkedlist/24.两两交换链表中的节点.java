/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode virtualHead = new ListNode(0);
        virtualHead.next = head;

        ListNode currNode = virtualHead;
        ListNode nodeOne;
        ListNode nodeTwo;
        ListNode nextCurr;

        while (currNode.next != null && currNode.next.next != null) {

            nodeOne = currNode.next;
            nodeTwo = nodeOne.next;
            nextCurr = nodeTwo.next;

            nodeTwo.next = nodeOne;
            nodeOne.next = nextCurr;

            currNode.next = nodeTwo;
            currNode = nodeOne;
        }

        return virtualHead.next;
    }
}
