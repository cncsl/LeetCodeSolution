/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
    /**
     * 确定链表是否有环，如果有返回快慢指针遍历时的相遇结点，如果没有返回 null
     */
    private ListNode getIntersect(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == hare) {
                return tortoise;
            }
        }

        return null;
}

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode intersect = getIntersect(head);
        if (intersect == null) {
            return null;
        }

        // 相遇结点离环的第一个结点的距离 和 首结点离环的第一个节点的距离 总是一样的
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
    }
}
// @lc code=end
