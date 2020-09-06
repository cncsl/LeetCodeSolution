/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */
class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || needle.length() == 0)
            return 0;
        if (haystack.length() == 0)
            return -1;

        char n = needle.charAt(0);
        int max = haystack.length() - needle.length();
        first: for (int i = 0; i <= max; i++) {
            // 找到第一个字符
            if (n == haystack.charAt(i)) {
                // 找到后检查剩下的部分
                for (int j = 1; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j))
                        continue first;
                }
                return i;
            }
        }
        return -1;
    }
}
