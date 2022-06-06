/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        //前i天买入的最小花销（前i天任意一天买入）
        int minCoast = Integer.MAX_VALUE;
        //前i天卖出股票的最大收入（前i天任意一天买入，注意隐含条件需要先买入）
        int maxProfit = 0;
        for (int price : prices) {
            minCoast = Math.min(minCoast, price);
            maxProfit = Math.max(maxProfit, price - minCoast);
        }
        return maxProfit;
    }
}
// @lc code=end

