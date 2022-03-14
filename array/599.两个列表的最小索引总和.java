/*
 * @lc app=leetcode.cn id=599 lang=java
 *
 * [599] 两个列表的最小索引总和
 */

// @lc code=start
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>(list1.length, 1);
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();
        int indexSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                //i 为list2列表的索引、j 为list1列表的索引
                int j = map.get(list2[i]);
                //索引和更小的数据
                if (i + j < indexSum) {
                    result.clear();
                    result.add(list2[i]);
                    indexSum = i + j;
                } 
                //索引和与之前的记录相等
                else if (i + j == indexSum) {
                    result.add(list2[i]);
                } else {
                    break;
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
// @lc code=end

