/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int N) {
        int first = 0;
        int second = 1;
        for (int i = 0; i < N; i++) {
            second = second + first;
            first = second - first;
        }
        return first;
    }
}
// @lc code=end
