/*
 * @lc app=leetcode.cn id=374 lang=java
 *
 * [374] 猜数字大小
 */

// @lc code=start
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 0;
        int right = n;
        while (left <= right) {
            int num = left + ((right - left) >> 2);
            int result = guess(num);
            if (result > 0) {
                left = num + 1;
            } else if (result == 0) {
                return num;
            } else {
                right = num - 1;
            }
        }
        return n;
    }
}
// @lc code=end

