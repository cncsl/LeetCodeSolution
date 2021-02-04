/*
 * @lc app=leetcode.cn id=643 lang=java
 *
 * [643] 子数组最大平均数 I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int kSum = 0;
        for (int i = 0; i < k; i++) {
            kSum += nums[i];
        }

        int maxKSum = kSum;
        for (int i = k; i < nums.length; i++) {
            kSum = kSum - nums[i - k] + nums[i];
            maxKSum = Math.max(maxKSum, kSum);
        }
        return (double) maxKSum / k;
    }
}
// @lc code=end

