/*
 * @lc app=leetcode.cn id=1441 lang=java
 *
 * [1441] 用栈操作构建数组
 */

// @lc code=start
class Solution {

    private static final String PUSH = "Push";
    private static final String POP = "Pop";

    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int cur = 1;
        for (int num: target) {
            while (cur++ < num) { res.add("Push"); res.add("Pop"); }
            res.add("Push");
        }
        return res;
    }
}
// @lc code=end

