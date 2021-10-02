/*
 * @lc app=leetcode.cn id=1822 lang=java
 *
 * [1822] 数组元素积的符号
 */

// @lc code=start
class Solution {

    public int arraySign(int[] nums) {
        int result = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            } else if (num < 0) {
                result *= -1;
            }
        }
        return result;
    }

}
// @lc code=end

