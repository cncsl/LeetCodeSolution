import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=95 lang=java
 *
 * [95] 不同的二叉搜索树 II
 *
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) 
            // 空树也是树
            return new LinkedList<>();
        return generate(1, n);
    }

    // 构造从 start 到 end 的序列可能组成的所有二叉搜索树
    public LinkedList<TreeNode> generate(int start, int end) {
        LinkedList<TreeNode> result = new LinkedList<TreeNode>();
        if (start > end) {
            // 空树也是树
            result.add(null);
            return result;
        }

        // 分别存放左子树和右子树所有可能的情况
        LinkedList<TreeNode> leftSubTreeList;
        LinkedList<TreeNode> rightSubTreeList;
        for (int i = start; i <= end; i++) {

            leftSubTreeList = generate(start, i - 1);
            rightSubTreeList = generate(i + 1, end);

            // 拼接左右子树
            for (TreeNode leftNode : leftSubTreeList) {
                for (TreeNode rightNode : rightSubTreeList) {
                    TreeNode currNode = new TreeNode(i);
                    currNode.left = leftNode;
                    currNode.right = rightNode;
                    result.add(currNode);
                }
            }
        }
        return result;
    }
}
