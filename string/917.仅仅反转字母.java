/*
 * @lc app=leetcode.cn id=917 lang=java
 *
 * [917] 仅仅反转字母
 */

// @lc code=start
class Solution {
    public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = S.toCharArray();
        int left = 0;
        int right = charArr.length - 1;
        while (left < charArr.length) {
            if (Character.isLetter(charArr[left])) {
                //从后往前找到第一个字母
                while (!Character.isLetter(charArr[right])) {
                    right--;
                }
                sb.append(charArr[right--]);
            } else {
                sb.append(charArr[left]);
            }
            left++;
        }
        return sb.toString();
    }
}
// @lc code=end

