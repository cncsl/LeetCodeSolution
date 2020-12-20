/*
 * @lc app=leetcode.cn id=1436 lang=java
 *
 * [1436] 旅行终点站
 */

// @lc code=start
class Solution {
    public String destCity(List<List<String>> paths) {
        if (paths == null) {
            return "";
        }

        Map<String, Integer> cityPath = new HashMap<>();
        paths.forEach(path -> {
            cityPath.put(path.get(0), cityPath.getOrDefault(path.get(0), 0) + 1);
            cityPath.put(path.get(1), cityPath.getOrDefault(path.get(1), 0));
        });

        return cityPath.keySet().stream().filter(s -> cityPath.get(s) == 0).findFirst().orElse("");
    }
}
// @lc code=end

