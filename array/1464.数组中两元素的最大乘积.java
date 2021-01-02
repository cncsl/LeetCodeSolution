/*
 * @lc app=leetcode.cn id=1464 lang=java
 *
 * [1464] 数组中两元素的最大乘积
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        int first = 0;
        int second = 0;
        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second) {
                second = num;
            }
        }
        return (first - 1) * (second - 1);
    }
}
// @lc code=end

