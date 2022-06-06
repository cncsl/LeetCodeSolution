/*
 * @lc app=leetcode.cn id=338 lang=java
 *
 * [338] 比特位计数
 */

// @lc code=start
class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        //第0位肯定是0，直接从第1位开始
        //result[0] = 0
        for (int i = 1; i <= n; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}
// @lc code=end

