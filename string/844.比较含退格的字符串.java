/*
 * @lc app=leetcode.cn id=844 lang=java
 *
 * [844] 比较含退格的字符串
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String S, String T) {
        for (int i = S.length() - 1, j = T.length() - 1, shipS = 0, shipT = 0;
             i >= 0 || j >= 0; i--, j--) {
            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    shipS++;
                    i--;
                } else if (shipS > 0) {
                    shipS--;
                    i--;
                } else {
                    break;
                }
            }
            while (j >= 0) {
                if (T.charAt(j) == '#') {
                    shipT++;
                    j--;
                } else if (shipT > 0) {
                    shipT--;
                    j--;
                } else {
                    break;
                }
            }

            if (i >= 0 && j >= 0) {
                if (S.charAt(i) != T.charAt(j)) {
                    return false;
                }
            } else if (i >= 0 || j >= 0) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

