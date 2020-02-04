import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        // 选择排序，对每一个 intervals[]，
        // intervals[][0] 做第一个排序依据，intervals[][1] 做第二个依据
        for (int i = 0; i < intervals.length; i++) {
            int min = i;
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[min][0] > intervals[j][0]) {
                    min = j;
                }
                if (intervals[min][0] == intervals[j][0]) {
                    min = intervals[min][1] < intervals[j][1] ? min : j;
                }
            }
            int[] temp = intervals[i];
            intervals[i] = intervals[min];
            intervals[min] = temp;
        }
        // 执行合并
        LinkedList<int[]> result = new LinkedList<>();
        for (int[] interval : intervals) {
            if (result.isEmpty() || result.getLast()[1] < interval[0]) {
                result.add(interval);
            } else {
                result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][2]);
    }
}
// @lc code=end
