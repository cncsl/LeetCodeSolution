/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */
class Solution {
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length/2; i++){
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}

