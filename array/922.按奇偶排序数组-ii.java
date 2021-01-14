/*
 * @lc app=leetcode.cn id=922 lang=java
 *
 * [922] 按奇偶排序数组 II
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int evenIndex = 0;
        int oddIndex = 1;
        while (evenIndex < A.length && oddIndex < A.length) {
            //找到偶数索引位置上为奇数的数，A[evenIndex] 为奇数时跳出循环
            while (evenIndex < A.length && A[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }
            //找到奇数索引位置上为偶数的数，A[oddIndex] 为偶数时跳出循环
            while (oddIndex < A.length && A[oddIndex] % 2 != 0) {
                oddIndex += 2;
            }
            if (oddIndex < A.length && evenIndex < A.length) {
                int temp = A[evenIndex];
                A[evenIndex] = A[oddIndex];
                A[oddIndex] = temp;
            }
        }
        return A;
    }
}
// @lc code=end

