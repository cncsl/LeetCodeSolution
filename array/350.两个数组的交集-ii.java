/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //确保 nums1 的第一个元素比 nums2 的第一个元素小
        if (nums1[0] > nums2[0]) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        List<Integer> result = new ArrayList<>();
        //遍历比较数组元素
        //当某个数组元素较小时，比较该数组的下一个元素
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i += 1;
                j += 1;
            } else if (nums1[i] < nums2[j]) {
                i += 1;
            } else {
                j += 1;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
// @lc code=end

