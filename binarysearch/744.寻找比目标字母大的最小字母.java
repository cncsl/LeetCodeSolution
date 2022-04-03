/*
 * @lc app=leetcode.cn id=744 lang=java
 *
 * [744] 寻找比目标字母大的最小字母
 */

// @lc code=start
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }

        int p = 0;
        int q = letters.length - 1;
        while (p < q) {
            int mid = p + ((q - p) >> 1);
            if (target >= letters[mid]) {
                p = mid + 1;
            } else {
                q = mid;
            }
        }
        return letters[p];
    }
}
// @lc code=end

