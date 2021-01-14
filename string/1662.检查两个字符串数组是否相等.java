/*
 * @lc app=leetcode.cn id=1662 lang=java
 *
 * [1662] 检查两个字符串数组是否相等
 */

// @lc code=start
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // i、j 是数组索引
        int i = 0;
        int j = 0;
        // p、q 是数组中元素（字符串）的索引
        int p = 0;
        int q = 0;
        while (i < word1.length && j < word2.length) {
            String sequenceOne = word1[i];
            String sequenceTwo = word2[j];
            if (sequenceOne.charAt(p++) != sequenceTwo.charAt(q++)) {
                return false;
            }
            if (p == sequenceOne.length()) {
                p = 0;
                i += 1;
            }
            if (q == sequenceTwo.length()) {
                q = 0;
                j += 1;
            }
        }
        //循环结束、如果有一个数组没有遍历完也不相等
        return i == word1.length && j == word2.length;
    }
}
// @lc code=end

