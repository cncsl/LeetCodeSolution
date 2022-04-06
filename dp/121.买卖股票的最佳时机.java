/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int minCoast = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minCoast = Math.min(minCoast, price);
            maxProfit = Math.max(maxProfit, price - minCoast);
        }
        return maxProfit;
    }
}
// @lc code=end

