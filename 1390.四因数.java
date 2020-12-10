/*
 * @lc app=leetcode.cn id=1390 lang=java
 *
 * [1390] 四因数
 */

// @lc code=start
class Solution {
    public int sumFourDivisors(int[] nums) {
        int result = 0;
        loop : for (int num : nums) {
            //任意数的必定有因数是1和其自身
            int count = 2;
            int sum = 1 + num;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    sum += i;
                }
                if (count > 4) {
                    continue loop;
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

