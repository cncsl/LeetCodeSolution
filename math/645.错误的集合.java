/*
 * @lc app=leetcode.cn id=645 lang=java
 *
 * [645] 错误的集合
 */

// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
        int distinctSum = Arrays.stream(nums).distinct().sum();
        return new int[]{
            Arrays.stream(nums).sum() - distinctSum,
            (1 + nums.length) * nums.length / 2 - distinctSum
        };
    }
}
// @lc code=end

