/**
 * https://leetcode-cn.com/problems/sparse-array-search-lcci/
 *
 */
class Solution {
    public int findString(String[] words, String s) {
        int left = 0;
        int right = words.length - 1;
        while (left <= right) {
            while (left < right && "".equals(words[left])) {
                left++;
            }
            while (left < right && "".equals(words[right])) {
                right--;
            }
            if (left <= right) {
                int mid = left + ((right - left) >> 1);
                while (mid < right && "".equals(words[mid])) {
                    mid++;
                }

                int compare = words[mid].compareTo(s);
                if (compare > 0) {
                    right = mid - 1;
                } else if (compare < 0) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}