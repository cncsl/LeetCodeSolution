/*
 * @lc app=leetcode.cn id=405 lang=java
 *
 * [405] 数字转换为十六进制数
 */

// @lc code=start
class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        //32位有符号数，转为16进制的字符串时，分别将0～7、8～15 ... 24～31位转为字符即可
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 7; i >= 0; i--) {
            int val = (num >> (4 * i)) & 0xf;
            if (resultBuilder.length() > 0 || val > 0) {
                char digit = val < 10 ? (char) ('0' + val) : (char) ('a' + val - 10);
                resultBuilder.append(digit);
            }
        }
        return resultBuilder.toString();
    }

}
// @lc code=end

