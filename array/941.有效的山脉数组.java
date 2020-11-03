/*
 * @lc app=leetcode.cn id=941 lang=java
 *
 * [941] 有效的山脉数组
 */

// @lc code=start
class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }

        int point = 0;
        while (point < A.length - 1 && A[point] < A[point + 1]) {
            point++;
        }
        
        if (point == 0 || point == A.length - 1) {
            return false;
        }
        while (point < A.length - 1) {
            if (A[point] <= A[point + 1]) {
                return false;
            }
            point++;
        }
        return true;
    }
}
// @lc code=end

