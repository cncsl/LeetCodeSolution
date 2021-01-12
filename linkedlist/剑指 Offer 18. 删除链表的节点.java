/**
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode virtHead = new ListNode(Integer.MIN_VALUE);
        virtHead.next = head;
        head = virtHead;
        while (head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
                break;
            }
            head = head.next;
        }
        return virtHead.next;
    }
}