package Tree.BST.question538;

import Tree.TreeNode;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：41 MB, 在所有 Java 提交中击败了74.00%的用户
 */
class Solution {
    int curSum;
    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }

    public void dfs(TreeNode curNode){
        if(curNode == null){
            return;
        }
        dfs(curNode.right);
        curNode.val = curNode.val + curSum;
        curSum = curNode.val;
        dfs(curNode.left);
    }
}
