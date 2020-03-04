/*
 * @lc app=leetcode.cn id=674 lang=java
 *
 * [674] 最长连续递增序列
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i - 1] < nums[i]){
                currentLength++;
                if(i == nums.length - 1){
                    maxLength = Math.max(maxLength, currentLength);
                }
            }else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        return maxLength;
    }
}
// @lc code=end
