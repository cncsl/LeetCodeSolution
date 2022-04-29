/*
 * @lc app=leetcode.cn id=435 lang=java
 *
 * [435] 无重叠区间
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (i, j) -> i[1] - j[1]);

        int count = 1;
        int previousRight = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= previousRight) {
                count++;
                previousRight = intervals[i][1];
            }
        }

        return intervals.length - count;
    }
}
// @lc code=end

