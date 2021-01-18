/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!charMap.containsKey(ch)) {
                return false;
            }
            charMap.put(ch, charMap.get(ch) - 1);
            if (charMap.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

