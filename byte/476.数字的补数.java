/*
 * @lc app=leetcode.cn id=476 lang=java
 *
 * [476] 数字的补数
 */

// @lc code=start
class Solution {

    public int findComplement(int num) {
        int i = num;
        //java.lang.Integer#highestOneBit
        i |= (i >>  1);
        i |= (i >>  2);
        i |= (i >>  4);
        i |= (i >>  8);
        i |= (i >> 16);
        //i 是和 num 二进制等长的全 1，如果 num 是 0b101010，则此时 i 是 0b111111
        return num ^ i;
    }

}
// @lc code=end

