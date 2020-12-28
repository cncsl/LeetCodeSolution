/*
 * @lc app=leetcode.cn lang=java
 *
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 */

class Solution {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}