/*
 * @lc app=leetcode.cn id=678 lang=java
 *
 * [678] 有效的括号字符串
 */

// @lc code=start
class Solution {
    public boolean checkValidString(String s) {
        Deque<Integer> leftDeque = new LinkedList<>();
        Deque<Integer> starDeque = new LinkedList<>();
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '(') {
                leftDeque.addFirst(i);
            } else if (charArr[i] == '*') {
                starDeque.addFirst(i);
            } else {
                if (!leftDeque.isEmpty()) {
                    leftDeque.removeFirst();
                } else if (!starDeque.isEmpty()) {
                    starDeque.removeFirst();
                } else {
                    return false;
                }
            }
        }
        while (!leftDeque.isEmpty() && !starDeque.isEmpty()) {
            if (leftDeque.removeFirst() > starDeque.removeFirst()) {
                return false;
            }
        }
        return leftDeque.isEmpty();
    }
}
// @lc code=end

