/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        String str = s + t;
        char[] charArr = str.toCharArray();
        int result = 0;
        for (char ch : charArr) {
            result ^= ch;
        }
        return (char) result;
    }
}
// @lc code=end

