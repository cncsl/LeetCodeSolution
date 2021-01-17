/*
 * @lc app=leetcode.cn id=1451 lang=java
 *
 * [1451] 重新排列句子中的单词
 */

// @lc code=start
class Solution {
    public String arrangeWords(String text) {
        String[] words = text.toLowerCase().split(" ");
        Arrays.sort(words, Comparator.comparingInt(String::length));

        char[] firstWord = words[0].toCharArray();
        firstWord[0] = Character.toUpperCase(firstWord[0]);
        StringBuilder resultBuilder = new StringBuilder(new String(firstWord));
        for (int i = 1; i < words.length; i++) {
            resultBuilder.append(' ').append(words[i]);
        }
        return resultBuilder.toString();
    }
}
// @lc code=end

