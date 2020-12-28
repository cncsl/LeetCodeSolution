/*
 * @lc app=leetcode.cn id=455 lang=java
 *
 * [455] 分发饼干
 */

// @lc code=start
class Solution {
    /**
     *
     * @param g 孩子们
     * @param s 饼干
     * @return 能满足的孩子数量
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;
        for (int sIndex = 0, gIndex = 0; sIndex < s.length && gIndex < g.length;) {
            if (g[gIndex] <= s[sIndex]) {
                result++;
                gIndex++;
                sIndex++;
            } else {
                sIndex++;
            }
        }
        return result;
    }
}
// @lc code=end

