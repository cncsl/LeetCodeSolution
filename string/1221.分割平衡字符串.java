/*
 * @lc app=leetcode.cn id=1221 lang=java
 *
 * [1221] 分割平衡字符串
 */

// @lc code=start
class Solution {
    public int balancedStringSplit(String s) {
        int result = 0;
        //未匹配为平衡子字符串的符号数量，正数 x 表示 x 个 L、负数 -x 表示 x 个 R
        int charCount = 0;
        for (char ch : s.toCharArray()) {
            charCount += ch == 'L' ? 1 : -1;
            if (charCount == 0) {
                result += 1;
            }
        }
        return result;
    }
}
// @lc code=end

