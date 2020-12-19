/*
 * @lc app=leetcode.cn id=1512 lang=java
 *
 * [1512] 好数对的数目
 */

// @lc code=start
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();
        //计算每个数出现多少次
        for (int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        //从value个相同的数中任取两个都是一组好数对
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
            int value = entry.getValue();
            //组合数，C2N
            result += value * (value - 1) / 2;
        }
        return result;
    }
}
// @lc code=end

