/*
 * @lc app=leetcode.cn id=875 lang=java
 *
 * [875] 爱吃香蕉的珂珂
 */

// @lc code=start
class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = piles[0];
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int resultK = right;
        //速度从[left, right]二分搜索，取满足h要求的最小值
        while (left < right) {
            int speed = left + ((right - left) >> 1);
            long time = getHour(piles, speed);
            if (time <= h) {
                resultK = speed;
                right = speed;
            } else {
                left = speed + 1;
            }
        }
        return resultK;
    }

    /**
     * 获取以指定速度吃完所有香蕉的时间
     */
    private long getHour(int[] piles, int k) {
        int hour = 0;
        for (int pile : piles) {
            // pile除k有余数时向上取整的处理
            hour += (pile + k - 1) / k;
        }
        return hour;
    }

}
// @lc code=end

