package Tree.recursion.question101;

import Tree.TreeNode;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.7 MB, 在所有 Java 提交中击败了19.25%的用户
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode leftNode, TreeNode rightNode){
        if(leftNode == null && rightNode != null){
            return false;
        }
        if(leftNode != null && rightNode == null){
            return false;
        }
        if(leftNode == null && rightNode == null){
            return true;
        }
        if(leftNode.val != rightNode.val){
            return false;
        }
        boolean flag = false;
        // 左子树和右子树遍历不同的节点 将问题转换为相同子树
        flag = dfs(leftNode.left, rightNode.right) && dfs(leftNode.right, rightNode.left);
        return flag;
    }
}
