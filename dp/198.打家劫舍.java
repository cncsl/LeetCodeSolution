/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        //previous 前i-1个房子能得到的最大利润
        //current 第i个房子能得到的最大利润
        int previous = nums[0];
        int current = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int recoder = Math.max(previous + nums[i], current);
            previous = current;
            current = recoder;
        }
        return current;
    }
}
// @lc code=end

