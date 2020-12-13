/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> numMap = new HashMap<>();
        for (int num : nums) {
            if (numMap.containsKey(num)) {
                return true;
            }
            numMap.put(num, true);
        }
        return false;
    }
}
// @lc code=end

