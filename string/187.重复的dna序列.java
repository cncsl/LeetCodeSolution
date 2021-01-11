/*
 * @lc app=leetcode.cn id=187 lang=java
 *
 * [187] 重复的DNA序列
 */

// @lc code=start
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        //target length
        int tLen = 10;
        //先用 set 存结果保证唯一
        Set<String> resultSet = new HashSet<>();
        Set<String> subStrings = new HashSet<>();
        for (int i = 0; i < s.length() - tLen + 1; i++) {
            String temp = s.substring(i, i + tLen);
            if (subStrings.contains(temp)) {
                resultSet.add(temp);
            } else {
                subStrings.add(temp);
            }
        }
        return new ArrayList<>(resultSet);
    }
}
// @lc code=end

