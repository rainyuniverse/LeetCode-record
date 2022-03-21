package Tree.recursion.question110;

import Tree.TreeNode;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：41.2 MB, 在所有 Java 提交中击败了14.49%的用户
 */
class Solution {
    int flag = 0;
    public boolean isBalanced(TreeNode root) {
        dfs(root, 0);
        if(flag == 1){
            return false;
        }
        return true;
    }

    public int dfs(TreeNode curNode, int depth){
        if(curNode == null){
            return depth;
        }
        int leftdepth = dfs(curNode.left, depth + 1);
        int rightdepth = dfs(curNode.right, depth + 1);
        if(Math.abs(leftdepth - rightdepth) > 1){
            flag = 1;
        }
        return Math.max(leftdepth, rightdepth);
    }
}
