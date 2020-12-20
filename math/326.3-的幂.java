/*
 * @lc app=leetcode.cn id=326 lang=java
 *
 * [326] 3的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        //换低公式
        double result = Math.log10(n) / Math.log10(3);
        // result 为整数是 n 是 3 的幂
        return (result - (int)result) == 0;
    }
}
// @lc code=end

