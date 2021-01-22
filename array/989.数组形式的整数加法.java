/*
 * @lc app=leetcode.cn id=989 lang=java
 *
 * [989] 数组形式的整数加法
 */

// @lc code=start
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> result = new LinkedList<>();
        int index = A.length - 1;
        int carry = 0;
        while (k / 10 > 0) {
            int sum = A[index] + k % 10 + carry;
            result.addFirst(sum % 10);
            carry = sum / 10;
            index -= 1;
            k /= 10;
        }
        //如果最高位发生进位
        if (carry != 0) {
            result.addFirst(1);
        }
        return result;
    }
}
// @lc code=end

