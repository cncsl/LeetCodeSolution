/*
 * @lc app=leetcode.cn id=933 lang=java
 *
 * [933] 最近的请求次数
 */

// @lc code=start
class RecentCounter {

    private Queue<Integer> pingQueue;

    public RecentCounter() {
        pingQueue = new LinkedList<>();
    }
    
    public int ping(int t) {
        pingQueue.offer(t);
        //将 t-3000s 之前的所有请求全部排除，队列中剩余元素的数量就是 [t-3000, t] 时间范围内的请求数
        while (pingQueue.peek() < t - 3000) {
            pingQueue.poll();
        }
        return pingQueue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
// @lc code=end

