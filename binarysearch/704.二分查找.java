/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int p = (left + right) / 2;
            if (nums[p] == target) {
                return p;
            } else if (nums[p] < target) {
                left = p + 1;
            } else if (nums[p] > target) {
                right = p - 1;
            }
        }
        return -1;
    }
}
// @lc code=end
