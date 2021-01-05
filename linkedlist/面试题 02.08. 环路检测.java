/**
 * https://leetcode-cn.com/problems/linked-list-cycle-lcci/
 *
 */
class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode faster = head;
        ListNode slow = head;
        while (faster.next != null && faster.next.next != null) {
            faster = faster.next.next;
            slow = slow.next;
            if (slow == faster) {
                while (head != slow) {
                    head = head.next;
                    slow = slow.next;
                }
                return head;
            }
        }
        return null;
    }
}