/*
 * @lc app=leetcode.cn id=554 lang=java
 *
 * [554] 砖墙
 */

// @lc code=start
class Solution {

    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (List<Integer> widths : wall) {
            int sum = 0;
            //遍历到倒数第二个，最后一块砖右侧到墙最左侧的距离不用计算
            for (int i = 0; i < widths.size() - 1; i++) {
                sum += widths.get(i);
                cnt.put(sum, cnt.getOrDefault(sum, 0) + 1);
            }
        }
        int maxCnt = 0;
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
            maxCnt = Math.max(maxCnt, entry.getValue());
        }
        return wall.size() - maxCnt;
    }


}
// @lc code=end

