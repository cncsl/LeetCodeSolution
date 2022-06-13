/*
 * @lc app=leetcode.cn id=1051 lang=java
 *
 * [1051] 高度检查器
 */

// @lc code=start
class Solution {
    public int heightChecker(int[] heights) {
        //得到计数数组长度：找到最大、最小的值
        int highest = Integer.MIN_VALUE;
        for (int height : heights) {
            highest = Math.max(height, highest);
        }
        //填充计数数组
        int[] countSortArray = new int[highest + 1];
        for (int height : heights) {
            countSortArray[height] += 1;
        }
        //反向填充原数组：实现上仅做了计数统计，没有改动入参的数组
        int idx = 0;
        int result = 0;
        for (int i = 1; i <= highest; i++) {
            for (int j = 1; j <= countSortArray[i]; j++) {
                if (heights[idx] != i) {
                    result += 1;
                }
                idx += 1;
            }
        }
        return result;
    }
}
// @lc code=end

