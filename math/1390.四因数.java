/*
 * @lc app=leetcode.cn id=1390 lang=java
 *
 * [1390] 四因数
 */

// @lc code=start
class Solution {
    public int sumFourDivisors(int[] nums) {
        int result = 0;
        for (int num : nums) {
            // count: 因数的个数
            // sum: 因数的和
            int count = 0, sum = 0;
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    count++;
                    sum += i;
                    if (i * i != num) {   // 判断 i 和 num/i 是否相等，若不相等才能将 num/i 看成新的因数
                        count++;
                        sum += num / i;
                    }
                }
            }
            if (count == 4) {
                result += sum;
            }
        }
        return result;
    }

}
// @lc code=end

