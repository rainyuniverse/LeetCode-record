package Tree.recursion.question543;

import Tree.TreeNode;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：40.7 MB, 在所有 Java 提交中击败了63.80%的用户
 */
class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root, 0);
        return max;
    }

    public int dfs(TreeNode curNode, int depth){
        if(curNode == null){
            return depth;
        }
        int curLeftDepth = dfs(curNode.left, 0);
        int curRightDepth = dfs(curNode.right, 0);
        max = Math.max(max, curLeftDepth + curRightDepth);
        return Math.max(curLeftDepth + depth + 1, curRightDepth + depth + 1);
    }
}
