/*
 * @lc app=leetcode.cn id=347 lang=java
 *
 * [347] 前 K 个高频元素
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> numsAndCount = new HashMap<>();
        for (int num : nums) {
            numsAndCount.put(num, numsAndCount.getOrDefault(num, 0) + 1);
        }
        //int[] 的第一个元素是数组值，第二个元素是出现次数，根据出现次数排序
        Queue<int[]> queue = new PriorityQueue<int[]>((m, n) -> m[1] - n[1]);
        for (Map.Entry<Integer, Integer> entry : numsAndCount.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            if (queue.size() == k) {
                //比较堆顶元素和当前遍历到的哈希表中的元素
                if (queue.peek()[1] < count) {
                    queue.poll();
                    queue.offer(new int[]{num, count});
                }
            } else {
                queue.offer(new int[]{num, count});
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll()[0];
        }
        return result;
    }
}
// @lc code=end

