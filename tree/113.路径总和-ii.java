import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=113 lang=java
 *
 * [113] 路径总和 II
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private List<List<Integer>> result;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        result = new ArrayList<>();

        List<Integer> path = new ArrayList<>();
        helper(root, sum, path);
        return result;
    }

    private void helper(TreeNode root, int sum, List<Integer> path){
        if(root != null){
            if(root.left == null && root.right == null && root.val == sum){
                path.add(root.val);
                result.add(path);
            }else{
                path.add(root.val);
                helper(root.left, sum - root.val, new ArrayList<>(path));
                helper(root.right, sum - root.val, new ArrayList<>(path));
            }
        }
    }
}

