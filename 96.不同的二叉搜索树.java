/*
 * @lc app=leetcode.cn id=96 lang=java
 *
 * [96] 不同的二叉搜索树
 */
class Solution {
    public int numTrees(int n) {
        // 保存从 0 到 n 做根结点时的答案数量
        int[] resultSet = new int[n + 1];
        // 空树也是树
        resultSet[0] = 1;
        // 一个结点只有一种情况
        resultSet[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                resultSet[i] += resultSet[j - 1] * resultSet[i - j];
            }
        }
        return resultSet[n];
    }
}
