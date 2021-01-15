/*
 * https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 *
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            result += n & 1;
            //无符号右移
            n = n >>> 1;
        }
        return result;
    }
}