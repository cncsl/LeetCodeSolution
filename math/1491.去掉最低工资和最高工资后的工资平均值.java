/*
 * @lc app=leetcode.cn id=1491 lang=java
 *
 * [1491] 去掉最低工资和最高工资后的工资平均值
 */

// @lc code=start
class Solution {
    public double average(int[] salary) {
        double sum = 0;
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        for (int sal : salary) {
            sum += sal;
            max = Math.max(max, sal);
            min = Math.min(min, sal);
        }
        return (sum - max - min) / (salary.length - 2);
    }
}
// @lc code=end

