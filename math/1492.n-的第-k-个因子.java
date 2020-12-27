/*
 * @lc app=leetcode.cn id=1492 lang=java
 *
 * [1492] n 的第 k 个因子
 */

// @lc code=start
class Solution {
    public int kthFactor(int n, int k) {
        int count = 0;
        int factor = 1;
        while (factor * factor <= n) {
            if (n % factor == 0) {
                if (++count == k) {
                    return factor;
                }
            }
            factor++;
        }
        factor--;
        //避免 x * x = n 的情况下 x 计算了两次
        if (factor * factor == n) {
            factor--;
        }
        while (factor > 0) {
            if (n % factor == 0) {
                if (++count == k) {
                    return n / factor;
                }
            }
            factor--;
        }
        return -1;
    }
}
// @lc code=end

