/*
 * @lc app=leetcode.cn id=401 lang=java
 *
 * [401] 二进制手表
 */

// @lc code=start
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for (int hour = 0; hour < 12; hour++) {
            int hourByteCount = Integer.bitCount(hour);
            for (int minute = 0; minute < 60; minute++) {
                if((hourByteCount + Integer.bitCount(minute)) == turnedOn) {
                    //用 String.format 实现补零
                    String time = String.format("%d:%02d", hour, minute);
                    result.add(time);
                }
            }
        }
        return result;
    }
}
// @lc code=end

