/**
 * https://leetcode-cn.com/problems/minimum-height-tree-lcci/
 * 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1); 
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        TreeNode root = null;
        if (start > end) {
            return root;
        }
        int mid = start + ((end - start) >> 1);
        root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }
}