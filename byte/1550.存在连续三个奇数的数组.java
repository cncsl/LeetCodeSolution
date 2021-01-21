/*
 * @lc app=leetcode.cn id=1550 lang=java
 *
 * [1550] 存在连续三个奇数的数组
 */

// @lc code=start
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] & 1) == 1) {
                if ((arr[i + 1] & 1) == 1) {
                    if ((arr[i + 2] & 1) == 1) {
                        return true;
                    } else {
                        i += 2;
                    }
                } else {
                    i += 1;
                }
            }
        }
        return false;
    }
}
// @lc code=end

