/*
 * @lc app=leetcode.cn id=1009 lang=java
 *
 * [1009] 十进制整数的反码
 */

// @lc code=start
class Solution {

    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }

        int i = n;
        //java.lang.Integer#highestOneBit
        i |= (i >>  1);
        i |= (i >>  2);
        i |= (i >>  4);
        i |= (i >>  8);
        i |= (i >> 16);
        //i 是和 num 二进制等长的全 1，如果 num 是 0b101010，则此时 i 是 0b111111
        return n ^ i;
    }
}
// @lc code=end

