/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        // a、e、i、o、u、A、E、I、O、U
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] charArr = s.toCharArray();
        int first = 0;
        int last = charArr.length - 1;
        while (first < last) {
            while (first < last && !vowels.contains(charArr[first])) {
                first++;
            }
            while (first < last && !vowels.contains(charArr[last])) {
                last--;
            }
            char temp = charArr[first];
            charArr[first] = charArr[last];
            charArr[last] = temp;
            first++;
            last--;
        }
        return new String(charArr);
    }
}
// @lc code=end

