/*
 * @lc app=leetcode.cn id=342 lang=java
 *
 * [342] 4的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {
        double result = Math.log10(n) / Math.log10(4);
        return result - (int)result == 0;
    }
}
// @lc code=end

