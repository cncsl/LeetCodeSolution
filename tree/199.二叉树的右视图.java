import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
 */

// @lc code=start
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        
        Queue<TreeNode> level = new LinkedList<>();
        level.offer(root);
        TreeNode node = null;
        int count = 0;
        while(!level.isEmpty()){
            count = level.size();
            
            for(int i = 0; i < count; i++){
                node = level.poll();
                if (node.left != null)
                    level.offer(node.left);
                if (node.right != null)
                    level.offer(node.right);
            }
            result.add(node.val);
        }
        return result;
    }
}
// @lc code=end

