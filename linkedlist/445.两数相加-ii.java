import java.util.Stack;

/*
 * @lc app=leetcode.cn id=445 lang=java
 *
 * [445] 两数相加 II
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        //使用两个栈保存数据
        Stack<Integer> numOne = new Stack<>();
        Stack<Integer> numTwo = new Stack<>();
        while (l1 != null) {
            numOne.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            numTwo.push(l2.val);
            l2 = l2.next;
        }
        ListNode head = null;
        //进位标志需要在循环体外使用
        int carry = 0;
        while (!numOne.isEmpty() || !numTwo.isEmpty()) {
            int sum = 0;
            sum += !numOne.isEmpty() ? numOne.pop() : 0;
            sum += !numTwo.isEmpty() ? numTwo.pop() : 0;
            sum = sum + carry;
            carry = sum / 10;

            //头插法创建链表
            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;
        }
        if (carry == 1) {
            ListNode node = new ListNode(1);
            node.next = head;
            head = node;
        }
        return head;
    }
}
