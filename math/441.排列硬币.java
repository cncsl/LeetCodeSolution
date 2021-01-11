/*
 * @lc app=leetcode.cn id=441 lang=java
 *
 * [441] 排列硬币
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        // n 转为 long 防止溢出
        double delta = (Math.sqrt(1 + (long) 8 * n) - 1) / 2;
        return (int) delta;
    }
}
// @lc code=end

