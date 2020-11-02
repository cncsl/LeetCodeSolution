class Solution {
    public int exchangeBits(int num) {
        //偶数 0xAAAAAAAA = 0b10101010_10101010_10101010_10101010
        int a = num & 0xAAAAAAAA;
        //奇数 0x55555555 = 0B01010101_01010101_01010101_01010101
        int b = num & 0x55555555;
        //无符号右移
        a >>>= 1;
        b <<= 1;
        return a | b;
    }
}