import java.util.LinkedList;

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
        // 执行合并(LinkedList 有getLast 方法)
        LinkedList<int[]> resultList = new LinkedList<>();
        for (int[] interval : intervals) {
            if (resultList.isEmpty() || resultList.getLast()[1] < interval[0]) {
                resultList.add(interval);
            } else {
                resultList.getLast()[1] = Math.max(resultList.getLast()[1], interval[1]);
            }
        }

        //不用toArray方法因为太慢
        int[][] resultArr = new int[resultList.size()][2];
        for (int i = 0; i < resultList.size(); i++) {
            resultArr[i] = resultList.get(i);
        }
        return resultArr;
    }
}
// @lc code=end
