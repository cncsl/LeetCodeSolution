/*
 * @lc app=leetcode.cn id=520 lang=java
 *
 * [520] 检测大写字母
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        char[] charArr = word.toCharArray();
        //循环计算大写字母个数
        int upper = 0;
        for (char ch : charArr) {
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            }
        }
        //全大写或全小写
        if (upper == charArr.length || upper == 0) {
            return true;
        }
        //首字母大写
        if (upper == 1 && charArr[0] >= 'A' && charArr[0] <= 'Z') {
            return true;
        }
        return false;
    }
}
// @lc code=end

