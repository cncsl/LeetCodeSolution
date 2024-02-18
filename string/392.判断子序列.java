/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392]  判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        //空字符串是总是其他字符串的子序列
        if (s.length() == 0) {
            return true;
        }
        //题目没说不存在这种情况，防御一下
        if (s.length() > t.length()) {
            return false;
        }

        char[] subArray = s.toCharArray();
        char[] targetArray = t.toCharArray();
        int i = 0;
        int j = 0;
        while (i < subArray.length && j < targetArray.length) {
            if (subArray[i] == targetArray[j]) {
                i += 1;
            }
            j += 1;
        }
        return i == subArray.length;
    }
}
// @lc code=end

