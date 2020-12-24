/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */
// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        //题目限定仅含小写字母
        Map<Character, Integer> map = new HashMap<>(26);
        char[] charArr = s.toCharArray();
        for (char ch : charArr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        //map.entrySet() 的迭代顺序不是 charArr 中的顺序
        for (int i = 0; i < charArr.length; i++) {
            if (map.get(charArr[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

