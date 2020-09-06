/*
 * @lc app=leetcode.cn id=1103 lang=java
 *
 * [1103] 分糖果 II
 */

// @lc code=start
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        // 一共有 x 份完整的糖果
        int x = (int) (Math.sqrt(2 * candies + 0.25) - 0.5);
        // 发完 x 份完整的糖果后剩余的糖果数量
        int surplus = (int) (candies - x * (x + 1) / 2);
        // 完整分配了 rows 次、第 rows + 1 次时排第 last 的人收到了完整的糖果
        int rows = x / num_people;
        int last = x % num_people;

        int[] result = new int[num_people];
        for (int i = 0; i < num_people; i++) {
            result[i] = (i + 1) * rows + (int) (rows * (rows - 1) / 2) * num_people;

            if (i < last) {
                result[i] += i + 1 + rows * num_people;
            }
        }
        result[last] += surplus;
        return result;
    }
}
// @lc code=end
