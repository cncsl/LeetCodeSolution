/*
 * @lc app=leetcode.cn id=636 lang=java
 *
 * [636] 函数的独占时间
 */

// @lc code=start
class Solution {

    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Deque<int[]> stack = new LinkedList<>();
        for (String log : logs) {
            String[] infos = log.split(":");
            int idx = Integer.parseInt(infos[0]);
            int timestamp = Integer.parseInt(infos[2]);
            if ("start".equals(infos[1])) {
                stack.push(new int[]{idx, timestamp});
            } else {
                int[] pop = stack.pop();
                int interval = timestamp - pop[1] + 1;
                result[pop[0]] += interval;
                if (!stack.isEmpty()) {
                    result[stack.peek()[0]] -= interval;
                }
            }
        }
        return result;
    }

}
// @lc code=end

