/*
 * @lc app=leetcode.cn id=501 lang=java
 *
 * [501] 二叉搜索树中的众数
 */

// @lc code=start

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private final List<Integer> resultList = new ArrayList<>();

    private int prevVal = 0;
    private int currCount = 0;
    private int maxCount = 0;

    public int[] findMode(TreeNode root) {
        ldr(root);

        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    // 中序遍历
    private void ldr(TreeNode root) {
        if (root != null) {
            ldr(root.left);
            if (prevVal != root.val) {
                currCount = 1;
                prevVal = root.val;
            } else {
                currCount++;
            }
            if (currCount > maxCount) {
                maxCount = currCount;
                resultList.clear();
                resultList.add(prevVal);
            } else if (currCount == maxCount) {
                resultList.add(prevVal);
            }
            ldr(root.right);
        }
    }
}
// @lc code=end
