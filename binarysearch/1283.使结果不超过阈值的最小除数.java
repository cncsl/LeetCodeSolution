/*
 * @lc app=leetcode.cn id=1283 lang=java
 *
 * [1283] 使结果不超过阈值的最小除数
 */

// @lc code=start
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = nums[0];
        for (int num : nums) {
            right = Math.max(right, num);
        }

        while (left < right) {
            int divisor = left + ((right - left) >> 1);
            int quotientSum = getQuotientSum(nums, divisor);
            if (quotientSum > threshold) {
                left = divisor + 1;
            } else {
                right = divisor;
            }
        }
        return left;
    }

    /**
     * 求入参数组中每个数都除以除数得到的商的和
     */
    private int getQuotientSum(int[] nums, int divisor) {
        int result = 0;
        for (int num : nums) {
            result += ((num + divisor - 1) / divisor);
        }
        return result;
    }
}
// @lc code=end

