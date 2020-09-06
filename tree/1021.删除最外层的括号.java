/*
 * @lc app=leetcode.cn id=1021 lang=java
 *
 * [1021] 删除最外层的括号
 */

// @lc code=start
class Solution {
    public String removeOuterParentheses(String S) {
        if (S == null || S.isEmpty()) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        char[] charArr = S.toCharArray();
        int brackets = 0;
        for (char c : charArr) {
            if (c == ')') {
                brackets--;
            }
            if (brackets >= 1) {
                sb.append(c);
            }
            if (c == '(') {
                brackets++;
            }
        }
        return sb.toString();
    }
}
// @lc code=end
