/**
 * https://leetcode.cn/problems/reverse-bits-lcci/
 */
class Solution {
    public int reverseBits(int num) {
        // 动态规划边界条件：num为0时result为1（只换一位0即可得到结果）
        int result = 1;
        // current从当前位向前n位都是1的长串，reverse从当前位向前n位都可以成为1的长串（current+1）
        int current = 0;
        int reverse = 0;
        //遍历 0～31 位
        for (int i = 0; i < 32; i++) {
            if ((num & 1) == 1) {
                current += 1;
                reverse += 1;
            } else {
                reverse = current + 1;
                current = 0;
            }

            result = reverse > result ? reverse : result;
            num >>= 1;
        }
        return result;
    }
}