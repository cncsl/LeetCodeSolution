/*
 * @lc app=leetcode.cn id=1598 lang=java
 *
 * [1598] 文件夹操作日志搜集器
 */

// @lc code=start
class Solution {

    public int minOperations(String[] logs) {
        int result = 0;
        for (String log : logs) {
            if ("../".equals(log)) {
                if (result > 0) {
                    result--;
                }
            } else if (!"./".equals(log)) {
                result++;
            }
        }
        return result;
    }

}
// @lc code=end

