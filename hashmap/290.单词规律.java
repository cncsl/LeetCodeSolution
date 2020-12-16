/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] charArr = pattern.toCharArray();
        String[] strArr = s.split(" ");
        if (charArr.length != strArr.length) {
            return false;
        }

        //char key、string value and string key、char value
        Map<Character, String> cksv = new HashMap<>();
        Map<String, Character> skcv = new HashMap<>();

        int sindex = 0;
        for (char ch : charArr) {
            String str = strArr[sindex++];
            //如果存在字母到单词的映射，检查对应映射，下方相同
            if (cksv.containsKey(ch) && !str.equals(cksv.get(ch))) {
                return false;
            }
            if (skcv.containsKey(str) && skcv.get(str) != ch) {
                return false;
            }
            cksv.put(ch, str);
            skcv.put(str, ch);
        }
        return true;
    }
}
// @lc code=end

