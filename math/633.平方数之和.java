/*
 * @lc app=leetcode.cn id=633 lang=java
 *
 * [633] 平方数之和
 */

// @lc code=start
class Solution {
    public boolean judgeSquareSum(int c) {
        int b = (int) Math.sqrt(c);
        int a = 0;
        while (a <= b) {
            int sum = a * a + b * b;
            if (sum == c) {
                return true;
            }
            if (sum < c) {
                a += 1;
            } else {
                b -= 1;
            }
        }
        return false;
    }
}
// @lc code=end

