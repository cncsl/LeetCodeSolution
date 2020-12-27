/*
 * @lc app=leetcode.cn id=1387 lang=java
 *
 * [1387] 将整数按权重排序
 */

// @lc code=start
class Solution {

    private Map<Integer, Integer> weightMap = new HashMap<>();

    public int getKth(int lo, int hi, int k) {
        weightMap = new HashMap<>();
        weightMap.put(1, 0);

        List<Integer> list = new ArrayList<Integer>();
        for (int i = lo; i <= hi; ++i) {
            list.add(i);
        }
        Collections.sort(list, (u, v) -> {
            if (countWeight(u) != countWeight(v)) {
                return countWeight(u) - countWeight(v);
            } else {
                return u - v;
            }
        });
        return list.get(k - 1);
    }

    public int countWeight(int num) {
        if (!weightMap.containsKey(num)) {
            if ((num & 1) != 0) {
                weightMap.put(num, countWeight(num * 3 + 1) + 1);
            } else {
                weightMap.put(num, countWeight(num >> 1) + 1);
            }
        }
        return weightMap.get(num);
    }

}
// @lc code=end

