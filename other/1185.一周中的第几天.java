/*
 * @lc app=leetcode.cn id=1185 lang=java
 *
 * [1185] 一周中的第几天
 */

// @lc code=start
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        // java.time 包不在 leetcode 允许使用的包中
        return LocalDate.of(day, month, year)
                .getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}
// @lc code=end

