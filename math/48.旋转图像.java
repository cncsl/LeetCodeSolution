/*
 * @lc app=leetcode.cn id=48 lang=java
 *
 * [48] 旋转图像
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        int lenX = matrix.length;
        // 水平翻转
        for (int i = 0; i < lenX / 2; ++i) {
            for (int j = 0; j < lenX; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[lenX - i - 1][j];
                matrix[lenX - i - 1][j] = temp;
            }
        }
        // 主对角线翻转
        for (int i = 0; i < lenX; ++i) {
            for (int j = 0; j < i; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
// @lc code=end

