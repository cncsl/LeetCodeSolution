/**
 * https://leetcode-cn.com/problems/swap-numbers-lcci/submissions/
 *
 *
 */
class Solution {
    /**
     * 不通过临时变量交换长度为 2 的两个数组中元素位置。
     *
     * 通过异或运算法则：
     * numbers[1] = numbers[1] ^ 0 
     *            = numbers[1] ^ numbers[0] ^ numbers[0]
     *            = numbers[0] ^ (numbers[1] ^ numbers[0])
     */
    public int[] swapNumbers(int[] numbers) {
        numbers[0] ^= numbers[1];
        numbers[1] ^= numbers[0];
        numbers[0] ^= numbers[1];
        return numbers;
    }
}