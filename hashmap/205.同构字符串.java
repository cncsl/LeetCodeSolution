/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 */

// @lc code=start
class Solution {
    //题干中未说明测试用例限定在英文字母范围，所以未用单个数组
    public boolean isIsomorphic(String s, String t) {
        char[] sourceArr = s.toCharArray();
        char[] targetArr = t.toCharArray();

        //source key target value, target key source value
        Map<Character, Character> sktv = new HashMap<>();
        Map<Character, Character> tksv = new HashMap<>();
        int length = sourceArr.length;
        for (int i = 0; i < length; i++) {
            if ((sktv.containsKey(sourceArr[i]) && sktv.get(sourceArr[i]) != targetArr[i])
                    || (tksv.containsKey(targetArr[i]) && tksv.get(targetArr[i]) != sourceArr[i])) {
                return false;
            }
            sktv.put(sourceArr[i], targetArr[i]);
            tksv.put(targetArr[i], sourceArr[i]);
        }
        return true;
    }
}
// @lc code=end

