package Tree.recursion.question226;

import Tree.TreeNode;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.7 MB, 在所有 Java 提交中击败了58.59%的用户
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        dfs(root);
        return root;
    }

    public void dfs(TreeNode curNode){
        if(curNode == null){
            return;
        }
        TreeNode tempNode = curNode.left;
        curNode.left = curNode.right;
        curNode.right = tempNode;
        dfs(curNode.left);
        dfs(curNode.right);
        return;
    }
}
