/*
 * @lc app=leetcode.cn id=2124 lang=java
 *
 * [2124] 检查是否所有 A 都在 B 之前
 */

// @lc code=start
class Solution {
    public boolean checkString(String s) {
        char[] chars = s.toCharArray();
        int lastaIndex = Integer.MIN_VALUE;
        int firstbIndex = Integer.MAX_VALUE;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' && i > lastaIndex) {
                lastaIndex = i;
            } else if (chars[i] == 'b' && i < firstbIndex) {
                firstbIndex = i;
            }
        }
        return lastaIndex < firstbIndex;
    }
}
// @lc code=end

