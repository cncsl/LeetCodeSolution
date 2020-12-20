/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        int result = 0;
        loop:
        for (int i = 2; i < n; i++) {
            for (int j = 2; j * j <= i; j++) {
                //余数为零不是质数
                if (i % j == 0) {
                    continue loop;
                }
            }
            result++;
        }
        return result;
    }
}
// @lc code=end

