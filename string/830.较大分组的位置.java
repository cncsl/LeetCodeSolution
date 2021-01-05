/*
 * @lc app=leetcode.cn id=830 lang=java
 *
 * [830] 较大分组的位置
 */

// @lc code=start
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int n = s.length();
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (start >= 3) {
                    ret.add(Arrays.asList(i - start + 1, i));
                }
                start = 1;
            } else {
                start++;
            }
        }
        return ret;
    }
}
// @lc code=end

