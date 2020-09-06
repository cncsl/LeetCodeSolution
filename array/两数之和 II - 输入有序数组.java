class Solution {
    /**
     * 双指针法
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] result = new int[2];

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                // 返回的下标不是从零开始的
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
        }
        return result;
    }
}