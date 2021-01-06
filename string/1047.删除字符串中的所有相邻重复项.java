/*
 * @lc app=leetcode.cn id=1047 lang=java
 *
 * [1047] 删除字符串中的所有相邻重复项
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String S) {
        Deque<Character> deque = new LinkedList<>();
        char[] charArr = S.toCharArray();
        for (char c : charArr) {
            if (!deque.isEmpty() && deque.peekFirst() == c) {
                deque.removeFirst();
            } else {
                deque.addFirst(c);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(deque.size());
        while (!deque.isEmpty()) {
            stringBuilder.append(deque.pollLast());
        }
        return stringBuilder.toString();
    }
}
// @lc code=end

