/*
 * @lc app=leetcode.cn id=1518 lang=java
 *
 * [1518] 换酒问题
 */

// @lc code=start
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        while (numBottles >= numExchange) {
            numBottles -= numExchange;
            result += 1;
            numBottles += 1;
        }
        return result;
    }
}
// @lc code=end

