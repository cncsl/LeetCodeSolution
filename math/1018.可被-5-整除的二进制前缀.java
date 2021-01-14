/*
 * @lc app=leetcode.cn id=1018 lang=java
 *
 * [1018] 可被 5 整除的二进制前缀
 */

// @lc code=start
class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new ArrayList<>();
        int prefix = 0;
        for (int a : A) {
            prefix = ((prefix << 1) + a) % 5;
            result.add(prefix % 5 == 0);
        }
        return result;
    }
}
// @lc code=end

