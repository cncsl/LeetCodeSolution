import java.util.ArrayList;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根到叶子节点数字之和
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper2(root, 0);
    }

    // private int result = 0;
    /**
     * 
     * @param node 结点引用
     * @param sum  该路径中，包括node结点在内之前的所有结点序列构成的数
     */
    // private void helper(TreeNode node, int sum) {
    //     if (node.left == null && node.right == null) {
    //         result = result + sum;
    //     }

    //     if (node.left != null) {
    //         helper(node.left, sum * 10 + node.left.val);
    //     }
    //     if (node.right != null) {
    //         helper(node.right, sum * 10 + node.right.val);
    //     }
    // }

    /**
     * 
     * @param node 当前结点引用
     * @param sum 当前路径下，node 结点的前驱结点序列构成的数
     * @return 当前结点下所有子树构成的数
     */
    private int helper2(TreeNode node, int sum) {
        //包含node结点在内的结点序列构成的数
        int cursum = sum * 10 + node.val;
        //叶子结点直接返回
        if (node.left == null && node.right == null) {
            return cursum;
        }
        int result = 0;
        // node 结点左子树构成的数
        if (node.left != null) {
            result += helper2(node.left, cursum);
        }
        // node 结点右子树构成的数
        if (node.right != null) {
            result += helper2(node.right, cursum);
        }
        // node 结点下左右子树构成的数的和
        return result;
    }
}
// @lc code=end
