/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */
class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int indexOne = 0;
        int indexTwo = height.length - 1;

        while (indexOne < indexTwo) {
            // “较短”的元素索引
            int lowerIndex = height[indexOne] < height[indexTwo] ? indexOne : indexTwo;
            maxarea = maxarea > height[lowerIndex] * (indexTwo - indexOne) ? maxarea
                    : height[lowerIndex] * (indexTwo - indexOne);
            if (height[indexOne] < height[indexTwo]) {
                indexOne++;
            }else
                indexTwo--;
        }
        return maxarea;
    }
}
