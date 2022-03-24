package Tree.recursion.question437;

import Tree.TreeNode;

import java.util.Set;

/**
 * 执行用时：26 ms, 在所有 Java 提交中击败了41.74%的用户
 * 内存消耗：40.9 MB, 在所有 Java 提交中击败了42.18%的用户
 */
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        // dfs(root, targetSum) 以当前节点为根节点向下遍历 计算以当前节点为起始节点（必须包含）的路径和等于目标路径的数量
        // pathSum(root.left, targetSum) 以当前节点的左节点为根节点向下遍历 计算以当前节点左节点为起始节点（不一定非要包含）的路径和等于目标路径的数量
        // pathSum(root.right, targetSum) 以当前节点的右节点为根节点向下遍历 计算以当前节点右节点为起始节点（不一定非要包含）的路径和等于目标路径的数量
        return dfs(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    public int dfs(TreeNode curNode, int targetSum){
        int res = 0;
        if(curNode == null){
            return 0;
        }
        if(curNode.val == targetSum){
            res++;
        }
        res = dfs(curNode.left, targetSum - curNode.val) + res;
        res = dfs(curNode.right, targetSum - curNode.val) + res;
        return res;
    }
}
