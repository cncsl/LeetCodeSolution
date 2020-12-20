/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    //返回结果
    private List<List<Integer>> result;
    //一条路径
    private List<Integer> path;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //排序方便后续剪枝
        Arrays.sort(candidates);

        result = new ArrayList<>();
        path = new ArrayList<>();

        fun(candidates, target, 0, 0);
        return result;
    }

    private void fun(int[] candidates, int target, int sum, int begin) {
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < candidates.length; i++) {
            int temp = sum + candidates[i];
            if (temp <= target) {
                path.add(candidates[i]);
                fun(candidates, target, temp, i);
                path.remove(path.size() - 1);
            } else {
                break;
            }
        }
    }
}
// @lc code=end

