/*
 * @lc app=leetcode.cn id=896 lang=java
 *
 * [896] 单调数列
 */

// @lc code=start
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increment = true;
        boolean decrement = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                increment = false;
            }
            if (nums[i] < nums[i + 1]) {
                decrement = false;
            }
        }
        return increment || decrement;
    }
}
// @lc code=end

