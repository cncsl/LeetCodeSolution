/*
 * @lc app=leetcode.cn id=1046 lang=java
 *
 * [1046] 最后一块石头的重量
 */

// @lc code=start
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stonesQueue = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            stonesQueue.offer(stone);
        }

        while (stonesQueue.size() >= 2) {
            int a = stonesQueue.poll();
            int b = stonesQueue.poll();
            // a == b 时两块石头都粉碎，PriorityQueue 特性保证了不会出现 a < b 的情况
            if (a > b) {
                stonesQueue.offer(a - b);
            } 
        }
        return stonesQueue.size() == 0 ? 0 : stonesQueue.poll();        
    }
}
// @lc code=end

