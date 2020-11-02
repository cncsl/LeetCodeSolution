/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {

    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int lo = 0;
        int hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] > target || (left && target == nums[mid])) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        int left = extremeInsertionIndex(nums, target, true);

        if (left == nums.length || nums[left] != target) {
            return result;
        }

        result[0] = left;
        result[1] = extremeInsertionIndex(nums, target, false) - 1;

        return result;
    }
}
// @lc code=end
