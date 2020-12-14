/*
 * @lc app=leetcode.cn id=728 lang=java
 *
 * [728] 自除数
 */

// @lc code=start
class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        int point = left;
        while (point <= right) {
            boolean isDividingNumber = true;
            int tempPoint = point;
            while (tempPoint > 0) {
                //取最后一位
                int last = tempPoint % 10;
                if (last == 0 || point % last != 0) {
                    isDividingNumber = false;
                    break;
                }
                tempPoint /= 10;
            }
            if (isDividingNumber) {
                result.add(point);
            }
            point++;
        }
        return result;
    }

}
// @lc code=end

