/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 */

// @lc code=start
class Solution {
    /**
     * 遍历字符串将遇到的字符存在栈中，遇到空格把所有元素全部出栈。
     */
    public String reverseWords(String s) {
        StringBuilder resultBuilder = new StringBuilder();
        Deque<Character> charDeque = new LinkedList<>();
        char[] charS = s.toCharArray();
        for (int i = 0; i < charS.length; i++) {
            if (charS[i] != ' ') {
                charDeque.addFirst(charS[i]);
            } else {
                while (!charDeque.isEmpty()) {
                    resultBuilder.append(charDeque.removeFirst());
                }
                resultBuilder.append(' ');
            }
        }
        //最后一个单词反转
        while (!charDeque.isEmpty()) {
            resultBuilder.append(charDeque.removeFirst());
        }
        return resultBuilder.toString();
    }
}
// @lc code=end

