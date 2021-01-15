/*
 * @lc app=leetcode.cn id=1189 lang=java
 *
 * [1189] “气球” 的最大数量
 */

// @lc code=start
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] letters = new int[26];
        for(char ch :text.toCharArray()){
            letters[ch - 97]++;
        }
        //l 和 o在单词中出现了两次
        letters['l' - 97] /= 2;
        letters['o' - 97] /= 2;
        int min = Integer.MAX_VALUE;
        for(char ch : "balon".toCharArray()){
            if(letters[ch - 97] < min){
                min = letters[ch - 97];
            }
        }
        return min;
    }
}
// @lc code=end

