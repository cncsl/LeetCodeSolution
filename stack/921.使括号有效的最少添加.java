/*
 * @lc app=leetcode.cn id=921 lang=java
 *
 * [921] 使括号有效的最少添加
 */

// @lc code=start
class Solution {
    public int minAddToMakeValid(String S) {
        Deque<Character> deque = new LinkedList<>();
        int result = 0;
        for (char ch : S.toCharArray()) {
            if (ch == '(') {
                deque.addFirst('(');
            } else {
                if (!deque.isEmpty()) {
                    deque.removeFirst();
                } else {
                    result++;
                }
            }
        }
        //实际 result 和 deque.size() 一定有一个为 0
        return result + deque.size();
    }
}
// @lc code=end

