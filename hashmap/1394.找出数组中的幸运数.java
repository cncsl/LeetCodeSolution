/*
 * @lc app=leetcode.cn id=1394 lang=java
 *
 * [1394] 找出数组中的幸运数
 */

// @lc code=start
class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> numberCount = new HashMap(arr.length, 1);

        for (int num : arr) {
            numberCount.compute(num, (n, count) -> Objects.isNull(count) ? 1 : count + 1);
        }
        int result = -1;
        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
            if (Objects.equals(entry.getKey(), entry.getValue()) && entry.getKey() > result){
                result = entry.getKey();
            }
        }
        return result;
    }
}
// @lc code=end

