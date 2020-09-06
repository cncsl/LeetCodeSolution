import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;

        Long prevVal = Long.MIN_VALUE;

        Stack<TreeNode> nodeStack = new Stack<>();
        TreeNode currNode = root;

        while (currNode != null || !nodeStack.isEmpty()) {
            while (currNode != null) {
                nodeStack.push(currNode);
                currNode = currNode.left;
            }

            currNode = nodeStack.pop();

            //在中序遍历的情况下，如果当前结点的值小于或等于前一个结点的值，则说明非二叉搜索树
            //特殊的，prevVal初始值为 Long 类型所允许的最小值，故第一个 currNode > prevVal 绝对成立
            //此外，在二叉搜索树中不允许相同结点出现，故 currNode.val == prevVal 时也应返回 false
            if (currNode.val <= prevVal)
                return false;
            prevVal = Long.valueOf(currNode.val);

            currNode = currNode.right;
        }
        return true;
    }
}
