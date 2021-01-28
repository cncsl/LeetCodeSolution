/*
 * @lc app=leetcode.cn id=724 lang=java
 *
 * [724] 寻找数组的中心索引
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            //中心索引处的值 nums[i] 不计入总和
            if (sum * 2 == total - nums[i]) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
// @lc code=end

