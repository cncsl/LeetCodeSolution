/*
 * @lc app=leetcode.cn id=796 lang=java
 *
 * [796] 旋转字符串
 */

// @lc code=start
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            boolean result = true;
            for (int j = 0; j < goal.length(); j++) {
                // (i + j) % s.length() 可以“循环”访问的 i 之前的元素
                if (s.charAt((i + j) % s.length()) != goal.charAt(j)) {
                    result = false;
                    break;
                }
            }
            if (result) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

