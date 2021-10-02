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

        Map<String, Integer> cityPath = new HashMap(Math.max(16, (int) (paths.size() * 1.25) ));
        paths.forEach(path -> {
            String startCityName = path.get(0);
            String destCityName = path.get(1);
            cityPath.put(startCityName, cityPath.getOrDefault(startCityName, 0) + 1);
            cityPath.put(destCityName, cityPath.getOrDefault(destCityName, 0));
        });

        return cityPath.keySet().stream().filter(s -> cityPath.get(s) == 0).findFirst().orElse("");
    }
}
// @lc code=end

